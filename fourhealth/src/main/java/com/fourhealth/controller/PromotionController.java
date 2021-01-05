package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.service.PromotionService;

@Controller
public class PromotionController {
	@Autowired
	private PromotionService promotionService;

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
		List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList = promotionService
				.getTrainerMyPromotionAllList("id002");
		model.addAttribute("myPromotionList", getTrainerMyPromotionAllList);
		return "trainer_layout/promtion/my_promotion_list";
	}

	// 트레이너 프로모션 내 수정페이지
	@GetMapping("/myPromotionModify")
	public String myPromotionModify(Model model) {
		return "trainer_layout/promtion/my_promotion_modify";
	}
}
