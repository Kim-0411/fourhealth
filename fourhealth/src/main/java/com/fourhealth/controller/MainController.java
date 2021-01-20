package com.fourhealth.controller;

import java.util.List;

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
	private Model model;

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

	@GetMapping("/food")
	public String food(Model model) {
		model.addAttribute("title", "Fourhealth About");
		return "main_layout/food";
	}

	@GetMapping("/exercise")
	public String exercise(Model model) {
		List<MetExerciseDto> easyList = exerciseService.getAllEasyExerciseList();
		List<MetExerciseDto> NormalList = exerciseService.getAllNormalExerciseList();
		List<MetExerciseDto> HardList = exerciseService.getAllHardExerciseList();
		model.addAttribute("title", "Fourhealth exercise");
		model.addAttribute("easy", easyList);
		model.addAttribute("normal", NormalList);
		model.addAttribute("hard", HardList);


		return "main_layout/exercise";
	}
}
