package com.fourhealth.mapper;

import java.util.List;
import java.util.Map;

/*
 * 트레이너 가입 승인, 회원 공통권한별 레벨, 사용자 플랫폼 공통 관리 코드, 등등....
 */

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.GradePlatformTrainerDto;
import com.fourhealth.dto.UserReportDto;

@Mapper
public interface MasterMapper {
	// 관리자가 트레이너 승인 처리
	public int masterTrainerAccess(String userId);

	public List<UserReportDto> reportList();
	// 프로모션 수 
	public int allpromotionCount();
	
	//전체 회원 수
	public int allMemberCount();
	//전체 트레이너 수 
	public int allTrainerCount();
	//전체 고객 수 
	public int alluserCount();
	//전체 음식dB수
	public int allFoodDBCount();
	//전체 운동db수
	public int allExerciseDBCount();
	//전체  질병dB수
	public int allDiseaseDBCount();
	//트레이너 공통 등급 리스트
	public List<GradePlatformTrainerDto> trainerPlatformGradeList();
	//트레이너 공통 등급 수정처리
	int modifyTrainerGrade(GradePlatformTrainerDto gradePlatformTrainerDto);
	//트레이너 공통 등급 수정 페이지 이동
	public GradePlatformTrainerDto getTrainerPlatformGradeCode(String trainerPlatformGradeCode);
	
}
