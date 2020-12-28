package com.fourhealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.SnsUserDto;
import com.fourhealth.mapper.SnsMapper;

@Service
@Transactional
public class SnsService {
	
	@Autowired
	private SnsMapper snsMapper;
	
	public String addSns(SnsUserDto snsuserdto) {
		String insertChk = "fail!";
		if(snsuserdto != null) {
			int result = snsMapper.addSns(snsuserdto);
			if(result > 0) insertChk="succes!";
		}
		return insertChk;
	}

}
