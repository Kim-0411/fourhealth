package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.CommonProfileDto;
import com.fourhealth.mapper.ProfileMapper;

@Service
@Transactional
public class ProfileService {
	
	@Autowired
	private ProfileMapper profileMapper;
	
	public List<CommonProfileDto> getProfile() {
		List<CommonProfileDto> profile = profileMapper.getProfile();
		return profile;
	}

}
