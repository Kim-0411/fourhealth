package com.fourhealth.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.GradePlatformTrainerDto;
import com.fourhealth.dto.TrainerDto;

@Mapper
public interface TrainerMapper {
	
	//로그인 후 메인화면 단에서 사용자 플랫폼 레벨 체크
	GradePlatformTrainerDto getTrainerGrade(String memberId);
	
	//회원가입 시 공통테이블과 트레이테이블에 데이터 생성
	public int addMemberTrainerPlatFormGradeCode(TrainerDto trainerdto);

}
