package com.fourhealth.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MetExerciseDto;


@Mapper
public interface ExerciseMapper {
	
	//전체 운동조회
	public List<MetExerciseDto> getAllExerciseList();
	//운동 검색 결과
	public List<Map<String, Object>> getAllSearchExerciseList(String exercise_name ,String met_coefficient, String startRow, String rowPerPage);
	//쉬운운동
	public List<MetExerciseDto> getAllEasyExerciseList();
	//보통운동
	public List<MetExerciseDto> getAllNormalExerciseList();
	//격렬운동
	public List<MetExerciseDto> getAllHardExerciseList();
	// 트레이너 프로모션리스트의 게시글 페이징을 위한 전체 게시글 카운트
	public int getExerciseListCount(String exercise_name ,String met_coefficient);
	
	
}
