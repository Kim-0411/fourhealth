package com.fourhealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.CommonUserDto;
import com.fourhealth.mapper.CommonUserMapper;

@Service
@Transactional
public class CommonUserService {
	
	@Autowired
	private CommonUserMapper commonUserMapper;

	public CommonUserDto getPrivateProfile(String userId) {
		CommonUserDto commonUserDto = commonUserMapper.getPrivateProfile(userId);
		return commonUserDto;
	}

	public String modifyPrivateProfile(CommonUserDto commonUserDto) {
		String result = "회원 수정 실패";
		
		int modifyCheck = commonUserMapper.modifyPrivateProfile(commonUserDto);
		
		if(modifyCheck > 0) result = "회원 수정 성공";
		
		return result;
	}

}
