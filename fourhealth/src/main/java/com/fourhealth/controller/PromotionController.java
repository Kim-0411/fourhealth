package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.MemberDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.dto.UserDto;
import com.fourhealth.mapper.MemberMapper;
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
		public String commonPromotionList(Model model) {
			return "main_layout/promotion/promotionList";
		}
		
	// 트레이너 프로모션 등록페이지
		@GetMapping("/myPromotionInsert")
		public String myPromotionInsert(Model model) {
			return "trainer_layout/promtion/my_promotion_insert";
		}

	// 트레이너 프로모션 내 리스트(트레이너 페이지에서 보는거)
	@GetMapping("/myPromotionList")
	public String trainerMyPromotionList(Model model) { 
		List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList = promotionService.getTrainerMyPromotionAllList("id002");
		model.addAttribute("myPromotionList",getTrainerMyPromotionAllList);
		return "trainer_layout/promtion/my_promotion_list";
	}
	//트레이너가 사용자에게 운동 이나 음식 넣어주기위해 프로모션별 등록된 회원 조회 
	@RequestMapping(value = "/getTrainerMyPromotionMemberList",method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<MatchingUserTrainerDto> getTrainerMyPromotionMemberList(@RequestParam(name = "promotionCode",required = false) String promotionCode){
		System.out.println(promotionCode);
		List<MatchingUserTrainerDto> getTrainerMatchingUserList = matchingService.getTrainerMatchingUserList(promotionCode);
		return getTrainerMatchingUserList;
	}
	
	//트레이너가 사용자에게 운동 이나 음식 넣어주기위해 프로모션별 등록된 회원(1명)의 신상 데이터 조회
		@RequestMapping(value = "/getTrainerMyPromotionMemberInfo",method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody UserDto getTrainerMyPromotionMemberInfo(@RequestParam(name = "userId",required = false) String userId){
			UserDto getTrainerMyPromotionMemberInfo = memberService.getTrainerMyMatchingUserInfo(userId);
			return getTrainerMyPromotionMemberInfo;
		}
	
	// 트레이너 프로모션 내 수정페이지
	@GetMapping("/myPromotionModify")
	public String myPromotionModify(Model model) {
		return "trainer_layout/promtion/my_promotion_modify";
	}
}
