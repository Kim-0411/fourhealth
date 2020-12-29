package com.fourhealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.UserDto;
import com.fourhealth.mapper.MemberMapper;

@Transactional
@Service
public class MemberService {

	@Autowired 
	private MemberMapper memberMapper;
	
	
	public UserDto getTrainerMyMatchingUserInfo(String userId) {
		UserDto getTrainerMyPromotionUser = memberMapper.getTrainerMyMatchingUserInfo(userId);
		return getTrainerMyPromotionUser;
	}

}
