package com.fourhealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.GradePlatformUserDto;

import com.fourhealth.mapper.UserMapper;



@Service
@Transactional

public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	////사용자 플렛폼 권한 체크 하여 치환 작업
	public GradePlatformUserDto getUserGrade(String memberId) {
		GradePlatformUserDto gradePlatformUserDto = userMapper.getUserGrade(memberId);
		System.out.println(gradePlatformUserDto.getUserPlatformGradeName());
		
		return gradePlatformUserDto;
	}

}
