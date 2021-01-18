package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MetExerciseDto;
import com.fourhealth.mapper.ScheduleMapper;

@Service
@Transactional
public class ScheduleService {
	@Autowired
	private ScheduleMapper scheduleMapper;
	
	//검색한 운동
		public List<MetExerciseDto> getAllSearchExerciseList(String exerciseName, String metCoefficient){
			List<MetExerciseDto> getSerachExercise = scheduleMapper.getAllSearchExerciseList(exerciseName, metCoefficient);
			return getSerachExercise;
		}

}
