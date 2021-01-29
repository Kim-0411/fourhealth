package com.fourhealth.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fourhealth.dto.MetExerciseDto;
import com.fourhealth.service.ExerciseService;

@Controller
public class MainController {

	@Autowired
	private ExerciseService exerciseService;

	/* thymeleaf 페이지 테스트 */
	// index page(main)
	@GetMapping("/")
	public String test(Model model) {
		model.addAttribute("test", "Hello thymeleaf");
		return "index";
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

	@GetMapping("/food/food")
	public String food(Model model) {
		model.addAttribute("title", "Fourhealth About");
		return "main_layout/food/food";
	}

}
