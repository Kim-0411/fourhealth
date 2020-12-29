package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping("mainTrainer")
	public String mainTrainer() {
		return "trainer/trainer_main";
	}

}
