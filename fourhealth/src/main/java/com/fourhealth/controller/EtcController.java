package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.MsgDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.mapper.MessageMapper;
import com.fourhealth.service.MatchingService;
import com.fourhealth.service.MessageService;
import com.fourhealth.service.PromotionService;

@Controller
public class EtcController {
	
	@Autowired
	PromotionService promotionService;
	@Autowired
	MatchingService matchingService;
	@Autowired
	MessageService messageService;
	

	//트레이너가 자신의 프로모션 별 메시지 보내주기 위한 화면 
	@GetMapping("trainerSendMessage")
	public String trainerSendMessage(Model model) {
		//id002트레이너 가정 로그인 프로세스 완료시 바꿔야함 
		List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList = promotionService.getTrainerMyPromotionAllList("id002");
		model.addAttribute("myPromotion",getTrainerMyPromotionAllList);
		return "trainer/trainer_massage_send";
	}
	
	//진행중
	//트레이너가 프로모션별로 등록되어 있는 회원들에게 전체 메시지 보냄.
	@PostMapping("sendTrainerSelectPromotionMember")
	public String sendTrainerSelectPromotionMember(MsgDto msg
												  ,@RequestParam(name = "trainer_promotion_notice_code",required = false)String promotionCode) {
		
		
		//프로모션 모집 공고 코드를 통해 등록되어 있는 회원아이디 가져온거.
		List<MatchingUserTrainerDto> matchingUserList = matchingService.getTrainerMatchingUserList(promotionCode);
		msg.setMatchingUserTrainer(matchingUserList);
		System.out.println(msg);
		
		String result = messageService.sendTrainerSelectPromotionMember(msg);
		System.out.println(result);
		
		return "redirect:/mainTrainer";
	}



}
