package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.Sns;
import com.fourhealth.mapper.SnsMapper;

@Service
@Transactional
public class SnsService {
	
	@Autowired
	private SnsMapper snsMapper;
	
	public String addSns(Sns sns) {
		String insertCheck = "게시 실패";
		if(sns != null) {
			int result = snsMapper.addSns(sns);
			if(result > 0) insertCheck = "게시 성공";
		}
		
		return insertCheck;
	}

	public List<Sns> getSnsList() {
		List<Sns> snsList = snsMapper.getSnsList();
		return snsList;
	}
}
