package com.fourhealth.controller;

import com.fourhealth.dto.MemberDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

//결제에 관련된 컨트롤러
@Controller
public class PaymentController {

    // 사용자가 프로모션 결제 하는 컨트롤러
    @PostMapping("/proPayment")
    public String proPayment(NoticePromotionTrainerDto promotionDTO, MemberDto memberDTO, Model model) {
        System.out.println(promotionDTO);
        model.addAttribute("p", promotionDTO);

        return "promotion/promotionPayment";
    }

}
