package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MetExerciseDto;


@Mapper
public interface ExerciseMapper {
	
	//전체 운동조회
	public List<MetExerciseDto> getAllExerciseList();
	//운동 검색 결과
	public List<MetExerciseDto> getAllSearchExerciseList(String exercise_name ,String met_coefficient);
	//쉬운운동
	public List<MetExerciseDto> getAllEasyExerciseList();
	//보통운동
	public List<MetExerciseDto> getAllNormalExerciseList();
	//격렬운동
	public List<MetExerciseDto> getAllHardExerciseList();
	
	
}
