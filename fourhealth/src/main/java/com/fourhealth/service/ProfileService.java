package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.CommonProfileDto;
import com.fourhealth.dto.MemberDto;
import com.fourhealth.mapper.MemberMapper;
import com.fourhealth.mapper.ProfileMapper;

@Service
@Transactional
public class ProfileService {
	
	@Autowired
	private ProfileMapper profileMapper;
	@Autowired
	private MemberMapper memberMapper;

	public List<CommonProfileDto> getTrainerProfile() {
		List<CommonProfileDto> trainerProfile = profileMapper.getTrainerProfile();
		return trainerProfile;
	}
	
	public List<MemberDto> viewMember() {
		List<MemberDto> member = memberMapper.viewMember();
		return member;
	}
}
