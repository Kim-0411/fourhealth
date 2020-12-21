package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fourhealth.dto.MetExercise;
import com.fourhealth.service.ExerciseService;


@Controller
public class ExerciseController {

	@Autowired
	private ExerciseService ExerciseService;

	@GetMapping("/")
	public String index(Model model) {
		List<MetExercise> easyList = ExerciseService.getEasyExercise();
		List<MetExercise> NormalList = ExerciseService.getNormalExercise();
		List<MetExercise> HardList = ExerciseService.getHardExercise();
		model.addAttribute("easy",easyList);
		model.addAttribute("normal",NormalList);
		model.addAttribute("hard",HardList);
		
		return "exercise/exercise_main";
	}

	@GetMapping("/allExercise") public String getAllExerciseList(Model model) {
		List<MetExercise> metExercise = ExerciseService.getAllExercise();
		model.addAttribute("MetExercise", metExercise); 
		return "exercise/exercise_all_list";
	}

	@PostMapping("/serachExercise")
	public String getSerachList(Model model
			,@RequestParam(name="exercise_name",required = false) String exerciseName
			,@RequestParam(name="met_coefficient",required = false) String metCoefficient) {
		System.out.println("아이디" +exerciseName);
		System.out.println("검색조건" +metCoefficient);
		List<MetExercise> serachList = ExerciseService.getSearchExercise(exerciseName, metCoefficient);
		System.out.println(serachList);
		model.addAttribute("serachList",serachList);

		return "exercise/exercise_serach_list";
	}


}
