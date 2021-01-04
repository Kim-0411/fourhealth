package com.fourhealth.service;

import java.util.List;

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
	
	
	  public String snsInsert(SnsUserDto snsUserDto) { 
			String insertCheck = "게시 실패";
			if(snsUserDto != null) {
				int result = snsMapper.snsInsert(snsUserDto);
				if(result > 0) insertCheck = "게시 성공";
			}
			
			return insertCheck;
		}
	 
	
	public List<SnsUserDto> getSnsList() {
		List<SnsUserDto> snsList = snsMapper.getSnsList();
		System.out.println("#######################");
		System.out.println("test file call snsList from snsService");
		System.out.println(snsList);
		return snsList;
		//return snsList;
	}
}
