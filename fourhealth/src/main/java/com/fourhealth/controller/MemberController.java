package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	// 로그인 화면(공통)
	@GetMapping("/login")
	public String commonLoginPage(Model model) {
		model.addAttribute("title", "로그인 화면");

		return "main_layout/login/login";
	}

	// 트레이너 메인화면
	@GetMapping("/mainTrainer")
	public String mainTrainer(Model model) {
		return "trainer_layout/trainer_main";
	}

}
