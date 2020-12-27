package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	/* thymeleaf 페이지 테스트 */
	@GetMapping("/")
	public String test(Model model) {
		model.addAttribute("test", "Hello thymeleaf");
		return "test";
	}

	// Matching page
	@GetMapping("/match")
	public String matching(Model model) {
		model.addAttribute("title", "Fourhealth 매칭");
		return "match";
	}

	// Contact page
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("title", "Fourhealth 컨텍트");
		return "contact";
	}

	// About Page
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "Fourhealth About");
		return "about";
	}

	@GetMapping("/information")
	public String information(Model model) {
		model.addAttribute("title", "Fourhealth Information");
		return "info";
	}

}
