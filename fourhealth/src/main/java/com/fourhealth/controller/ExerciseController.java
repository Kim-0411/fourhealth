package com.fourhealth.controller;

/*
 * 운동(관리자, 트레이너, 사용자)
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fourhealth.dto.MetExerciseDto;
import com.fourhealth.service.ExerciseService;

@Controller
public class ExerciseController {

	@Autowired
	private ExerciseService ExerciseService;

	//운동 화면 (전체 접근가능)
	@GetMapping("/exercise")
	public String commonExercise(Model model) {
		List<MetExerciseDto> easyList = ExerciseService.getEasyExercise();
		List<MetExerciseDto> NormalList = ExerciseService.getNormalExercise();
		List<MetExerciseDto> HardList = ExerciseService.getHardExercise();
		model.addAttribute("easy", easyList);
		model.addAttribute("normal", NormalList);
		model.addAttribute("hard", HardList);

		return "exercise/exercise_main";
	}
	//전체 운동보기 (전체 접근가능)
	@GetMapping("/allExercise")
	public String CommonGetAllExerciseList(Model model) {
		List<MetExerciseDto> metExercise = ExerciseService.getAllExercise();
		model.addAttribute("MetExercise", metExercise);
		return "exercise/exercise_all_list";
	}
	//운동검색 (전체 접근가능)
	@PostMapping("/serachExercise")
	public String CommonGetSerachList(Model model,
			@RequestParam(name = "exercise_name", required = false) String exerciseName,
			@RequestParam(name = "met_coefficient", required = false) String metCoefficient) {
		System.out.println("아이디" + exerciseName);
		System.out.println("검색조건" + metCoefficient);
		List<MetExerciseDto> serachList = ExerciseService.getSearchExercise(exerciseName, metCoefficient);
		System.out.println(serachList);
		model.addAttribute("serachList", serachList);

		return "exercise/exercise_serach_list";
	}

}
