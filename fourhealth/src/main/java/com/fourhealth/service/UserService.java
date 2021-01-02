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
	
	public GradePlatformUserDto getUserGrade(String memberId) {
		GradePlatformUserDto gradePlatformUserDto = userMapper.getUserGrade(memberId);
		System.out.println(gradePlatformUserDto.getUserPlatformGradeName());
		
		return gradePlatformUserDto;
	}

}
