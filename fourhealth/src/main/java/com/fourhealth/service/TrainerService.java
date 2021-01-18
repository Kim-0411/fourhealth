package com.fourhealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.GradePlatformTrainerDto;
import com.fourhealth.dto.GradePlatformUserDto;
import com.fourhealth.dto.TrainerDto;
import com.fourhealth.mapper.TrainerMapper;

@Service
@Transactional

public class TrainerService {

	@Autowired
	private TrainerMapper trainerMapper;

	// 회원가입 성공 및 실패 체크
	public String addMemberTrainerPlatFormGradeCode(TrainerDto trainerdto) {
		String insertCheck = "회원가입 실패";
			if (trainerdto != null) {
				int result = trainerMapper.addMemberTrainerPlatFormGradeCode(trainerdto);
				if (result > 0)
					insertCheck = "회원가입 성공";
			}
			return insertCheck;
		}
	
	//트레이너 권한에 따른 플랫폼 등급 정보 가져오기
	public GradePlatformTrainerDto getTrainerGrade(String memberId) {
		GradePlatformTrainerDto gradePlatformTrainerDto =  trainerMapper.getTrainerGrade(memberId);
		
		
		return gradePlatformTrainerDto;
		
	}
	
	}

