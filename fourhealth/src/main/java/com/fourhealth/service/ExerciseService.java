package com.fourhealth.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MetExercise;
import com.fourhealth.mapper.ExerciseMapper;

@Service
@Transactional

public class ExerciseService {

	@Autowired
	private ExerciseMapper ExerciseMapper;

	//운동전체 
	public List<MetExercise> getAllExercise(){ 
		List<MetExercise> metExercise = ExerciseMapper.getAllExercise(); 
		return metExercise;
	}
	//검색한 운동
	public List<MetExercise> getSearchExercise(String exerciseName, String metCoefficient){
		List<MetExercise> getSerachExercise = ExerciseMapper.getSearchExercise(exerciseName, metCoefficient);
		return getSerachExercise;
	}
	//쉬운운동(운동메인)
	public List<MetExercise> getEasyExercise(){
		List<MetExercise> getEasyExercise = ExerciseMapper.getEasyExercise();
		return getEasyExercise;
	}
	//보통운동(운동메인)
	public List<MetExercise> getNormalExercise(){
		List<MetExercise> getEasyExercise = ExerciseMapper.getNormalExercise();
		return getEasyExercise;
	}
	//격렬한운동(운동메인)
	public List<MetExercise> getHardExercise(){
		List<MetExercise> getEasyExercise = ExerciseMapper.getHardExercise();
		return getEasyExercise;
	}
	




}
