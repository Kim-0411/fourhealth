package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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


	//로그인 되었을시 세션값을 통해 트레이너가 자기가 등록한 프로모션 목록 조회
	@GetMapping("/trainerMyPromotionList")
	public String trainerMyPromotionList(Model model) { 
		List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList = promotionService.getTrainerMyPromotionAllList("id002");
		model.addAttribute("myPromotionList",getTrainerMyPromotionAllList);
		return "trainer/my_promotion_list";
	}



	//트레이너가 자신의 프로모션중 관리할 프로모션에 접근시 등록된 사용자들 목록조회
	@GetMapping("/trainerMyPromotionMemberList")
	public String trainerGetMyPromotionMemberList(Model model,
												  @RequestParam(name = "promotionCode", required = false) String promotionCode) {
		List<MatchingUserTrainerDto> getMemberList = matchingService.getTrainerMatchingUserList(promotionCode);
		System.out.println(getMemberList);
		model.addAttribute("memberList",getMemberList);
		return "trainer/my_promotion_member_list"; 
	}




}
