package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MetExercise;


@Mapper
public interface ExerciseMapper {
	
	//전체 운동조회
	public List<MetExercise> getAllExercise();
	//운동 검색 결과
	public List<MetExercise> getSearchExercise(String exercise_name ,String met_coefficient);
	//쉬운운동
	public List<MetExercise> getEasyExercise();
	//보통운동
	public List<MetExercise> getNormalExercise();
	//격렬운동
	public List<MetExercise> getHardExercise();
	
	
}
