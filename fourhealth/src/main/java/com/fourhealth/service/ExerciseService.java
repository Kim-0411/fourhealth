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
	private ExerciseMapper ExerciseMapper;

	//운동전체 
	public List<MetExerciseDto> getAllExercise(){ 
		List<MetExerciseDto> metExercise = ExerciseMapper.getAllExercise(); 
		return metExercise;
	}
	//검색한 운동
	public List<MetExerciseDto> getSearchExercise(String exerciseName, String metCoefficient){
		List<MetExerciseDto> getSerachExercise = ExerciseMapper.getSearchExercise(exerciseName, metCoefficient);
		return getSerachExercise;
	}
	//쉬운운동(운동메인)
	public List<MetExerciseDto> getEasyExercise(){
		List<MetExerciseDto> getEasyExercise = ExerciseMapper.getEasyExercise();
		return getEasyExercise;
	}
	//보통운동(운동메인)
	public List<MetExerciseDto> getNormalExercise(){
		List<MetExerciseDto> getEasyExercise = ExerciseMapper.getNormalExercise();
		return getEasyExercise;
	}
	//격렬한운동(운동메인)
	public List<MetExerciseDto> getHardExercise(){
		List<MetExerciseDto> getEasyExercise = ExerciseMapper.getHardExercise();
		return getEasyExercise;
	}
	




}
