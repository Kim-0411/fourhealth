package com.fourhealth.mapper;

import java.util.List;

/*
 * 스케쥴, 수행률
 */

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MetExerciseDto;

@Mapper
public interface ScheduleMapper {
	//운동 검색 결과
		public List<MetExerciseDto> getAllSearchExerciseList(String exercise_name ,String met_coefficient);

}
