package com.fourhealth.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourhealth.dto.MetExerciseDto;
import com.fourhealth.service.ExerciseService;

@Controller
public class ExerciseController {

	@Autowired
	private ExerciseService exerciseService;

	
	//전체 운동보기 (전체 접근가능)
	@GetMapping("/allExerciseList")
	public String allExerciseList(Model model) {
		List<MetExerciseDto> metExercise = exerciseService.getAllExerciseList();
		model.addAttribute("MetExercise", metExercise);
		return "exercise/exercise_all_list";
	}
	//운동검색 (전체 접근가능)
	@PostMapping("/serachExercise")
	public String serachExercise(Model model,
			@RequestParam(name = "exercise_name", required = false) String exerciseName,
			@RequestParam(name = "met_coefficient", required = false) String metCoefficient) {
		System.out.println("아이디" + exerciseName);
		System.out.println("검색조건" + metCoefficient);
		List<MetExerciseDto> serachList = exerciseService.getAllSearchExerciseList(exerciseName, metCoefficient);
		System.out.println(serachList);
		model.addAttribute("serachList", serachList);

		return "exercise/exercise_serach_list";
	}
	
	// 트레이너가 회원에게 운동 정보를 넣어주기 위해 사용되는 운동 데이터 검색 및 넣음.
	@RequestMapping(value = "/serachTrainerExercise", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody List<MetExerciseDto> serachTrainerExercise(@RequestParam Map<String, Object> map) {
		System.out.println(map);
		String exerciseName = (String) map.get("exerciseName");
		String metCoefficient = (String) map.get("exerciseHow");
		System.out.println(exerciseName + metCoefficient);
		List<MetExerciseDto> getExerciseList = exerciseService.getAllSearchExerciseList(exerciseName, metCoefficient);

		return getExerciseList;
	}
}
