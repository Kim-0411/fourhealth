package com.fourhealth.controller;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromotionController {

	// 트레이너 프로모션 전체리스트 컨트롤러(회원이 보는거 )공통
	@GetMapping("/proList")
	public String commonPromotionList(Model model) {
		return "main_layout/promotion/promotionList";
	}

}
