package com.fourhealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.GradePlatformUserDto;
import com.fourhealth.dto.UserDto;
import com.fourhealth.mapper.UserMapper;

@Service
@Transactional

public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	//사용자 플렛폼 권한 체크 하여 치환 작업
	public GradePlatformUserDto getUserGrade(String memberId) {
		GradePlatformUserDto gradePlatformUserDto = userMapper.getUserGrade(memberId);
		System.out.println(gradePlatformUserDto.getUserPlatformGradeName());
		
		return gradePlatformUserDto;
	}
	
	// 회원가입시 user 플랫폼 등급 기본셋팅을 위한 작업
		public String addMemberUserPlatFormGradeCode(UserDto userdto) {
			String insertCheck = "회원가입 실패";
			if (userdto != null) {
				int result = userMapper.addMemberUserPlatFormGradeCode(userdto);
				if (result > 0)
					insertCheck = "회원가입 성공";
			}

			return insertCheck;
		}

}
