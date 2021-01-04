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

}
