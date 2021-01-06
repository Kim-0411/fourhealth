package com.fourhealth.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.GradePlatformTrainerDto;
import com.fourhealth.dto.TrainerDto;

@Mapper
public interface TrainerMapper {
	
	//로그인 후 메인화면 단에서 사용자 플랫폼 레벨 체크
	GradePlatformTrainerDto getTrainerGrade(String memberId);
	public int addMemberTrainerPlatFormGradeCode(TrainerDto trainerdto);

}
