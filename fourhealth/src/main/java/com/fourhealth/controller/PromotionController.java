package com.fourhealth.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.dto.UserDto;
import com.fourhealth.service.MatchingService;
import com.fourhealth.service.MemberService;
import com.fourhealth.service.PromotionService;
import com.fourhealth.utility.ImageUpload;
import com.fourhealth.utility.TotalDate;

@Controller
public class PromotionController {
	@Autowired
	private PromotionService promotionService;

	@Autowired
	private MatchingService matchingService;

	@Autowired
	private MemberService memberService;

	@Autowired
	private ImageUpload imageUpload;

	@Autowired
	private TotalDate utilTotalDate;

	// 트레이너 프로모션 전체리스트 컨트롤러(회원이 보는거 )공통
	@GetMapping("/main/promtion/promotionList")
	public String commonPromotionList(Model model,
			@RequestParam(name = "currentPage", required = false, defaultValue = "1") int currentPage) {

		model.addAttribute("title", "프로모션목록");

		Map<String, Object> resultMap = promotionService.getPromotionListPaging(currentPage);

		model.addAttribute("promotionList", resultMap.get("promotionList"));
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		model.addAttribute("endPageNum", resultMap.get("endPageNum"));

		// 페이징없이 프로모션 전체화면 보기
		// List<NoticePromotionTrainerDto> promotionList =
		// promotionService.promotionList();
		// System.out.println(promotionList);
		// model.addAttribute("promotionList", promotionList);
		return "main_layout/promotion/promotionList";
	}

	// 트레이너 프로모션 등록전 최초데이터 체크컨트롤러
	@GetMapping("trainer/promtion/promotionCheck")
	public String promotionCheck(@RequestParam(name = "proId", required = false) String proId,
			HttpServletResponse response, HttpServletRequest request) throws IOException {

		System.out.println(proId);
		System.out.println(promotionService.promotionCheck(proId));
		String re = promotionService.promotionCheck(proId);
		int i = Integer.parseInt(re);
		if (proId.equals("")) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();
			session.setAttribute("SID", "id002");
			out.println(
					"<script>alert('로그인을 확인해주세요. 확인을 누르시면 id002로 세션이 처리됩니다.'); location.href='/trainer/promtion/myPromotionInsert';</script>");
			return null;
		} else {
			if (i > 0) {
				return "redirect:/trainer/promtion/myPromotionInsert";
			} else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('정보를 확인해주세요.'); location.href='/';</script>");
				out.flush();
				return null;
			}
		}
	}

	// 트레이너 프로모션 등록페이지
	@GetMapping("trainer/promtion/myPromotionInsert")
	public String myPromotionInsert(Model model) {
		return "manage_layout/trainer/promtion/my_promotion_insert";
	}

	// 트레이너 프로모션 등록컨트롤러
	@PostMapping("/promotionInsert")
	public String trainerPromotionInsert(NoticePromotionTrainerDto promotionDto)
			throws ParseException, FileNotFoundException {

		System.out.println("처음 받아온 값----->" + promotionDto);

		// 사진 업로드
		MultipartFile trainerPromotionBgImage = promotionDto.getTrainerPromotionBgImage();
		String rename = imageUpload.imageUpload(trainerPromotionBgImage);
		System.out.println("파일 이름----->" + rename);
		promotionDto.setProImageUrl(rename);

		// 토탈 일자 계산
		String start = promotionDto.getTrainerPromotionAttendStartDate();
		String end = promotionDto.getTrainerPromotionRecruitCloseDate();
		String totalDate = utilTotalDate.utilTotalDate(start, end);
		System.out.println("토탈 일자----->" + totalDate);
		promotionDto.setTrainerPromotionRecruitTotalDate(totalDate);

		System.out.println("수정된 값 ----->" + promotionDto);

		promotionService.promotionInsert(promotionDto);

		return "redirect:/trainer/promtion/myPromotionList";
	}

	// 트레이너 프로모션 내 리스트(트레이너 페이지에서 보는거)
	@GetMapping("trainer/promtion/myPromotionList")
	public String trainerMyPromotionList(Model model) {
		List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList = promotionService
				.getTrainerMyPromotionAllList("id002");
		model.addAttribute("myPromotionList", getTrainerMyPromotionAllList);
		return "manage_layout/trainer/promtion/my_promotion_list";
	}

	// 트레이너가 사용자에게 운동 이나 음식 넣어주기위해 프로모션별 등록된 회원 조회
	@RequestMapping(value = "/getTrainerMyPromotionMemberList", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<MatchingUserTrainerDto> getTrainerMyPromotionMemberList(
			@RequestParam(name = "promotionCode", required = false) String promotionCode) {
		System.out.println(promotionCode);
		List<MatchingUserTrainerDto> getTrainerMatchingUserList = matchingService
				.getTrainerMatchingUserList(promotionCode);
		return getTrainerMatchingUserList;
	}

	// 트레이너가 사용자에게 운동 이나 음식 넣어주기위해 프로모션별 등록된 회원(1명)의 신상 데이터 조회
	@RequestMapping(value = "/getTrainerMyPromotionMemberInfo", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody UserDto getTrainerMyPromotionMemberInfo(
			@RequestParam(name = "userId", required = false) String userId) {
		UserDto getTrainerMyPromotionMemberInfo = memberService.getTrainerMyMatchingUserInfo(userId);
		return getTrainerMyPromotionMemberInfo;
	}

	// 트레이너 프로모션 내 수정페이지
	@GetMapping("trainer/promtion/myPromotionModify")
	public String modifyMyPromotion(Model model,
			@RequestParam(name = "trainerPromotionNoticeCode", required = false) String trainerPromotionNoticeCode) {

		NoticePromotionTrainerDto promotionDto = promotionService.promotionDetail(trainerPromotionNoticeCode);
		System.out.println(promotionDto);
		model.addAttribute("promotionUpdate", promotionDto);

		return "manage_layout/trainer/promtion/my_promotion_modify";
	}

	@PostMapping("promotionModify")
	public String modifyUpdateMyPromotion(NoticePromotionTrainerDto promotionDto)
			throws FileNotFoundException, ParseException {

		System.out.println(promotionDto);

		// 사진 업로드
		MultipartFile trainerPromotionBgImage = promotionDto.getTrainerPromotionBgImage();
		String rename = imageUpload.imageUpload(trainerPromotionBgImage);
		System.out.println("파일 이름----->" + rename);
		promotionDto.setProImageUrl(rename);

		// 토탈 일자 계산
		String start = promotionDto.getTrainerPromotionAttendStartDate();
		String end = promotionDto.getTrainerPromotionRecruitCloseDate();
		String totalDate = utilTotalDate.utilTotalDate(start, end);
		System.out.println("토탈 일자----->" + totalDate);
		promotionDto.setTrainerPromotionRecruitTotalDate(totalDate);

		System.out.println("수정된 값 ----->" + promotionDto);
		promotionService.modifyUpdateMyPromotion(promotionDto);
		return "redirect:/trainer/promtion/myPromotionList";
	}

	// 트레이너 프로모션 상세정보 컨트롤러
	@GetMapping("main/promtion/promotionDetail")
	public String commonPromotionDetail(@RequestParam(name = "proCode", required = false) String proCode, Model model) {

		System.out.println(proCode);

		NoticePromotionTrainerDto promotionDto = promotionService.promotionDetail(proCode);
		System.out.println(promotionDto);
		model.addAttribute("proDetail", promotionDto);

		return "main_layout/promotion/promotionDetail";
	}

}
