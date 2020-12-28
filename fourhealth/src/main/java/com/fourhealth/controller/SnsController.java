package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SnsController {

	@GetMapping("/addSns")
	public String testSns() {
		return "sns/snsList";
	}
	
	@GetMapping("/snsList")
	public String getSnsList
}
