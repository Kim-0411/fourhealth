package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	//트레이너 메인화면
	@GetMapping("mainTrainer")
	public String mainTrainer() {
		return "trainer/trainer_main";
	}
	

}
