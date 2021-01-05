package com.fourhealth.controller;

/*
 * 매칭, 결제, 쿠폰, 환불 신청, 등등....
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.fourhealth.dto.CommonUserDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;

@Controller
public class MatchingController {

	//결제에 관련된 컨트롤러
	@Controller
	public class PaymentController {

	    // 사용자가 프로모션 결제 하는 컨트롤러
	    @PostMapping("/proPayment")
	    public String proPayment(NoticePromotionTrainerDto promotionDTO, CommonUserDto memberDTO, Model model) {
	        System.out.println(promotionDTO);
	        model.addAttribute("p", promotionDTO);

	        return "promotion/promotionPayment";
	    }
	}
}
