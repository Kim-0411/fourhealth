package com.fourhealth.mapper;

/*
 * 운동(관리자, 트레이너, 사용자)
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MetExerciseDto;

@Mapper
public interface ExerciseMapper {
	
	//전체 운동조회
	public List<MetExerciseDto> getAllExercise();
	//운동 검색 결과
	public List<MetExerciseDto> getSearchExercise(String exercise_name ,String met_coefficient);
	//쉬운운동
	public List<MetExerciseDto> getEasyExercise();
	//보통운동
	public List<MetExerciseDto> getNormalExercise();
	//격렬운동
	public List<MetExerciseDto> getHardExercise();
	
	
}
