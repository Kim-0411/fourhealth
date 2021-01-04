package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class MainController {


	/* thymeleaf 페이지 테스트 */
	// index page(main)
	@GetMapping("/") 
	public String test(Model model) {
		model.addAttribute("test", "Hello thymeleaf");
		return "index";
	}

	
	// Sns page
	@GetMapping("/sns")
	public String matching(Model model) {
		model.addAttribute("title", "Fourhealth matching");
		return "main_layout/sns";
	}

	
	// Contact page
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("title", "Fourhealth Contact");
		return "main_layout/contact";
	}

	
	// About Page
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "Fourhealth About");
		return "main_layout/about";
	}

}
