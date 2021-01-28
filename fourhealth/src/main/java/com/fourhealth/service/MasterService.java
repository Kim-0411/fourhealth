package com.fourhealth.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.GradePlatformTrainerDto;
import com.fourhealth.dto.MemberDto;
import com.fourhealth.dto.UserReportDto;
import com.fourhealth.mapper.MasterMapper;
import com.fourhealth.mapper.MemberMapper;

@Service
@Transactional
public class MasterService {
	@Autowired
	MasterMapper masterMapper;
	//관리자가 트레이너 가입승인 처리
	public int masterTrainerAccess(String userId) {
		int result = masterMapper.masterTrainerAccess(userId);
		return result;
	}
	
	public List<UserReportDto> reportList(){
		List<UserReportDto> reportList = masterMapper.reportList();
		
		return reportList;
	}
	
	//관리 화면에 통계 총프로모션수,전체회원,트레이너,고객 수,운동DB,질병DB,음식DB 수
	public Map<String, Integer> countNum(){
		int allpromotionCount = masterMapper.allpromotionCount();
		int allMemberCount = masterMapper.allMemberCount();
		int allTrainerCount = masterMapper.allTrainerCount();
		int alluserCount = masterMapper.alluserCount();
		
		int allFoodDBCount = masterMapper.allFoodDBCount();
		int allExerciseDBCount = masterMapper.allExerciseDBCount();
		int allDiseaseDBCount = masterMapper.allDiseaseDBCount();
		
		Map<String,Integer> count = new HashMap<>();
		count.put("allpromotionCount", allpromotionCount);
		count.put("allMemberCount", allMemberCount);
		count.put("allTrainerCount", allTrainerCount);
		count.put("alluserCount", alluserCount);
		count.put("allFoodDBCount", allFoodDBCount);
		count.put("allExerciseDBCount", allExerciseDBCount);
		count.put("allDiseaseDBCount", allDiseaseDBCount);
	
		
		return count;
	}
	//관리 화면에서 플랫폼 트레이너 플랫폼 공통 등급 관리 코드, 관리명, 최종 수수료, 등록일자 
	public List<GradePlatformTrainerDto> trainerPlatfromList(){
		List<GradePlatformTrainerDto> gradePlatformTrainerList = masterMapper.trainerPlatformGradeList();
		return gradePlatformTrainerList;
	}
	// 트레이너 공통 등급 수정화면 이동
	public GradePlatformTrainerDto getTrainerPlatformGradeCode(String trainerPlatformGradeCode) {
		System.out.println(trainerPlatformGradeCode);

		GradePlatformTrainerDto trainerGrade = masterMapper.getTrainerPlatformGradeCode(trainerPlatformGradeCode);

		System.out.println("trainerGrade정보 조회 값" + trainerGrade);
		return trainerGrade;
	}
	//관리자 단에서 플랫폼 트레이너 플랫폼 공통 등급 수정
	public String modifyTrainerGrade(GradePlatformTrainerDto gradePlatformTrainerDto) {
		String result = "트레이너 공통 등급 수정 실패";
		int modifyTrainerGradeCheck = masterMapper.modifyTrainerGrade(gradePlatformTrainerDto);
		if (modifyTrainerGradeCheck > 0)
			result = "트레이너 공통 등급 수정 성공";
		return result;
	}
}
