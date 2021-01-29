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

	public CommonUserDto getPrivateProfile() {
		CommonUserDto commonUserDto = commonUserMapper.getPrivateProfile();
		return commonUserDto;
	}

}
