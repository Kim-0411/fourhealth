
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

@Controller
public class PromotionController {
	@Autowired
	private PromotionService promotionService;

	@Autowired
	private MatchingService matchingService;

	@Autowired
	private MemberService memberService;

	// 트레이너 프로모션 전체리스트 컨트롤러(회원이 보는거 )공통
	@GetMapping("trainer/promtion/promotionList")
	public String commonPromotionList(Model model,
			@RequestParam(name = "currentPage", required = false, defaultValue = "1") int currentPage) {

		model.addAttribute("title", "프로모션목록");

		Map<String, Object> resultMap = promotionService.getPromotionListPaging(currentPage);

		model.addAttribute("promotionList", resultMap.get("promotionList"));
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("currentPage", 	 currentPage);
		model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		model.addAttribute("endPageNum", resultMap.get("endPageNum"));

		// 페이징없이 프로모션 전체화면 보기
		// List<NoticePromotionTrainerDto> promotionList =
		// promotionService.promotionList();
		// System.out.println(promotionList);
		// model.addAttribute("promotionList", promotionList);
		return null;
	}

	// 트레이너 프로모션 등록전 최초데이터 체크컨트롤러
	@GetMapping("trainer/promtion/promotionCheck")
	public String promotionCheck(@RequestParam(name = "proId", required = false) String proId,
			HttpServletResponse response) throws IOException {

		System.out.println(proId);
		System.out.println(promotionService.promotionCheck(proId));
		String re = promotionService.promotionCheck(proId);
		int i = Integer.parseInt(re);
		if (proId.equals("")) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('로그인을 확인해주세요.'); location.href='/login';</script>");
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
	@GetMapping("/trainer/promtion/myPromotionInsert")
	public String myPromotionInsert(Model model) {
		return "manage_layout/trainer/promtion/my_promotion_insert";
	}

	// 트레이너 프로모션 등록컨트롤러
	@PostMapping("/promotionInsert")
	public String trainerPromotionInsert(MultipartHttpServletRequest request, NoticePromotionTrainerDto promotionDto,
			@RequestParam("file") MultipartFile multipartFile) throws ParseException, FileNotFoundException {

		System.out.println(promotionDto);
		System.out.println(multipartFile);

		return "redirect:/myPromotionList";
	}

	@ResponseBody
	@PostMapping("/image")
	public void summer_image(MultipartFile file, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String fileName = file.getOriginalFilename();
		// String server_file_name = fileDBName(file_name, save_folder);

		System.out.println("out : " + out);
		System.out.println("file_name : " + fileName);
		// file.transferTo(new File(save_folder + server_file_name));

		// out.println("resources/upload" + server_file_name);
		// out.close();

	}

	// // 트레이너 프로모션 등록컨트롤러
	// @PostMapping("/promotionInsert")
	// public String trainerPromotionInsert(MultipartHttpServletRequest request,
	// NoticePromotionTrainerDto promotionDto)
	// throws ParseException, FileNotFoundException {

	// System.out.println(promotionDto);

	// String fileName = null;

	// if (!promotionDto.getTrainerPromotionBgImage().isEmpty()) {
	// int rdv = (int) (Math.random() * 1000);
	// fileName = promotionDto.getTrainerPromotionBgImage().getOriginalFilename();
	// String rename = rdv + "_" + fileName;
	// // String path =
	// //
	// "C:\\Users\\ECS\\Documents\\GitHub\\fourhealth\\fourhealth\\src\\main\\resources\\static\\image\\";

	// String realPath = ResourceUtils.getFile("src/main/resources/static/image/" +
	// rename).getAbsolutePath();
	// // 배포패스

	// try {
	// new File(realPath).mkdir();
	// promotionDto.getTrainerPromotionBgImage().transferTo(new File(realPath));

	// } catch (IllegalStateException e) {
	// e.printStackTrace();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// promotionDto.setProImageUrl(rename);
	// }

	// String start = promotionDto.getTrainerPromotionAttendStartDate();
	// String end = promotionDto.getTrainerPromotionRecruitCloseDate();

	// System.out.println("proInsert start-------------" + start);
	// System.out.println("proInsert end-------------" + end);

	// SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	// java.util.Date stDt = format.parse(start);
	// java.util.Date edDt = format.parse(end);

	// long diff = edDt.getTime() - stDt.getTime();
	// long diffDays = diff / (24 * 60 * 60 * 1000);
	// String totalDate = Long.toString(diffDays);

	// System.out.println(diffDays);
	// promotionDto.setTrainerPromotionRecruitTotalDate(totalDate);

	// System.out.println(promotionDto);

	// promotionService.promotionInsert(promotionDto);

	// return "redirect:/myPromotionList";
	// }

	// 트레이너 프로모션 내 리스트(트레이너 페이지에서 보는거)
	@GetMapping("/myPromotionList")
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
	public String myPromotionModify(Model model) {
		return "manage_layout/trainer/promtion/my_promotion_modify";
	}

	// 트레이너 프로모션 상세정보 컨트롤러
	@GetMapping("trainer/promtion/promotionDetail")
	public String commonPromotionDetail(@RequestParam(name = "proCode", required = false) String proCode, Model model) {

		System.out.println(proCode);

		NoticePromotionTrainerDto promotionDto = promotionService.promotionDetail(proCode);
		System.out.println(promotionDto);
		model.addAttribute("proDetail", promotionDto);

		return "main_layout/promotion/promotionDetail";
	}

}
