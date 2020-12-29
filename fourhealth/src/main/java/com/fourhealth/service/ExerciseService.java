package com.fourhealth.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MetExerciseDto;
import com.fourhealth.mapper.ExerciseMapper;

@Service
@Transactional

public class ExerciseService {

	@Autowired
	private ExerciseMapper exerciseMapper;

	//운동전체 
	public List<MetExerciseDto> getAllExerciseList(){ 
		List<MetExerciseDto> metExercise = exerciseMapper.getAllExerciseList(); 
		return metExercise;
	}
	//검색한 운동
	public List<MetExerciseDto> getAllSearchExerciseList(String exerciseName, String metCoefficient){
		List<MetExerciseDto> getSerachExercise = exerciseMapper.getAllSearchExerciseList(exerciseName, metCoefficient);
		return getSerachExercise;
	}
	//쉬운운동(운동메인)
	public List<MetExerciseDto> getAllEasyExerciseList(){
		List<MetExerciseDto> getEasyExercise = exerciseMapper.getAllEasyExerciseList();
		return getEasyExercise;
	}
	//보통운동(운동메인)
	public List<MetExerciseDto> getAllNormalExerciseList(){
		List<MetExerciseDto> getEasyExercise = exerciseMapper.getAllNormalExerciseList();
		return getEasyExercise;
	}
	//격렬한운동(운동메인)
	public List<MetExerciseDto> getAllHardExerciseList(){
		List<MetExerciseDto> getEasyExercise = exerciseMapper.getAllHardExerciseList();
		return getEasyExercise;
	}
	




}
