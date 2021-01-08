package com.fourhealth.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Map<String, Object> getAllSearchExerciseList(String exerciseName, String metCoefficient,int currentPage){
		int startRow = 0;
		int rowPerPage = 5;
		int startPageNum = 1;

		// last 페이지 구하기
		double count = exerciseMapper.getExerciseListCount(exerciseName,metCoefficient);
		int lastPage = (int) Math.ceil(count / rowPerPage);

		int endPageNum = lastPage;

		// 페이지 알고리즘
		startRow = (currentPage - 1) * rowPerPage;
		String stRow = String.valueOf(startRow);
		String rowPage = String.valueOf(rowPerPage);
		List<Map<String, Object>> exerciseList = exerciseMapper.getAllSearchExerciseList(exerciseName,metCoefficient,stRow, rowPage);

		if (currentPage > 6) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;

			if (endPageNum >= lastPage) {
				startPageNum = (lastPage - 9);
				endPageNum = lastPage;
			}
		}

		System.out.println(lastPage);
		System.out.println(endPageNum);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("lastPage", lastPage);
		resultMap.put("exerciseList", exerciseList);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("endPageNum", endPageNum);

		System.out.println(resultMap + "--------->getPromotionListPaging");

		return resultMap;
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
