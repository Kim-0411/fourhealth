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
	
	
	// 회원가입 성공 및 실패 체크
	public String addMemberUserPlatFormGradeCode(UserDto userdto) {
		String insertCheck = "회원가입 실패";
		if (userdto != null) {
			int result = userMapper.addMemberUserPlatFormGradeCode(userdto);
			if (result > 0)
				insertCheck = "회원가입 성공";
		}

		return insertCheck;
	}

	//사용자 권한에 따른 플랫폼 등급 정보 가져오기
		public GradePlatformUserDto getUserGrade(String memberId) {
			GradePlatformUserDto gradePlatformUserDto = userMapper.getUserGrade(memberId);
			System.out.println(gradePlatformUserDto.getUserPlatformGradeName());
			
			return gradePlatformUserDto;
	}

}
