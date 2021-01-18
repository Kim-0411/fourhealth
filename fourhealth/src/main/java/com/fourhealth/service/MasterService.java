package com.fourhealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.mapper.MasterMapper;

@Service
@Transactional
public class MasterService {
	@Autowired
	MasterMapper masterMapper;
	//관리자가 트레이너 가입승인 처리
	public int masterTrainerAccess(String userId) {
		int result = masterMapper.masterTrainerAccess(userId);
		return result;
	}

}
