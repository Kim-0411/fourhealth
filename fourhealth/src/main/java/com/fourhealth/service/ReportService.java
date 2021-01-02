package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.CategoriesReportDto;
import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.UserReportDto;
import com.fourhealth.mapper.BoardMapper;

@Service
@Transactional
public class ReportService {

	@Autowired
	private BoardMapper boardMapper;
	
	//신고 나의 프로모션 보여주는 처리
	public List<MatchingUserTrainerDto> reportPromotionList(String userId){
		System.out.println(userId);
		List<MatchingUserTrainerDto> reportPromotionList = boardMapper.reportPromotionList(userId);
		System.out.println("서비스에서 리스트" + reportPromotionList);
		return reportPromotionList;
	}
	
	//신고 이유 전체 리스트 처리
	public List<CategoriesReportDto> reportReasonList(){
		List<CategoriesReportDto> reportReasonList = boardMapper.reportReasonList();
		
		return reportReasonList;
	}
	
	//신고 전체 리스트 처리
	public List<UserReportDto> reportList(){
		List<UserReportDto> reportList	= boardMapper.reportList();
		
		return reportList;
	}
	
}
