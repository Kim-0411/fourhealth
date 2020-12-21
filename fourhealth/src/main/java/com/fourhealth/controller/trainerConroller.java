package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fourhealth.dto.NoticePromotionTrainer;
/*import com.fourhealth.service.MatchingUserTrainerService;*/
import com.fourhealth.service.NoticePromotionTrainerService;

@Controller
public class trainerConroller {
	/*
	 * @Autowired private MatchingUserTrainerService matchingUserTrainerService;
	 */
	@Autowired
	private NoticePromotionTrainerService noticePromotionTrainerService;

	//로그인됫다고 가정
	@GetMapping("/myPromotion")
	public String getMyMember(Model model) {
		//아이디 있다고 가정 결제할때 하나씩 증가시켜줘야하는데 결제 하는거보고 하기로.
		/*
		 * String result = matchingUserTrainerService.MatchingUserTrainerCount("id002");
		 */
		List<NoticePromotionTrainer> myPromotionList = noticePromotionTrainerService.getMyPromotionList("id002");
		model.addAttribute("myPromotionList",myPromotionList);
		return "trainer/my_promotion_list";
	}



}
