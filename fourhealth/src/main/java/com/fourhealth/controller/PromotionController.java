
package com.fourhealth.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@GetMapping("/promotionList")
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

	// 트레이너 프로모션 등록페이지
	@GetMapping("/myPromotionInsert")
	public String myPromotionInsert(Model model) {
		return "manage_layout/trainer/promtion/my_promotion_insert";
	}

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
	@GetMapping("/myPromotionModify")
	public String myPromotionModify(Model model) {
		return "manage_layout/trainer/promtion/my_promotion_modify";
	}

	// 트레이너 프로모션 상세정보 컨트롤러
	@GetMapping("/promotionDetail")
	public String commonPromotionDetail(@RequestParam(name = "proCode", required = false) String proCode, Model model) {

		System.out.println(proCode);

		NoticePromotionTrainerDto promotionDto = promotionService.promotionDetail(proCode);
		System.out.println(promotionDto);
		model.addAttribute("proDetail", promotionDto);

		return "main_layout/promotion/promotionDetail";
	}

}

