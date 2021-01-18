package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.UserReportDto;
import com.fourhealth.mapper.MasterMapper;

@Service
@Transactional
public class MasterService {

	@Autowired
	private MasterMapper mastermapper;
	
	public List<UserReportDto> reportList(){
		List<UserReportDto> reportList = mastermapper.reportList();
		
		return reportList;
	}
}
