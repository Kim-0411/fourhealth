package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.UserReportDto;
import com.fourhealth.mapper.BoardMapper;

@Service
@Transactional
public class ReportService {

	@Autowired
	private BoardMapper boardMapper;
	
	//신고 전체 리스트 처리
	public List<UserReportDto> reportList(){
		List<UserReportDto> reportList	= boardMapper.reportList();
		
		return reportList;
	}
	
}
