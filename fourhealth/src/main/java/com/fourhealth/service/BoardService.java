package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fourhealth.dto.CategoriesReportDto;
import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.UserReportDto;
import com.fourhealth.mapper.BoardMapper;

@Service
@Transactional
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	//신고게시판에서 나의 프로모션을 보여주는 입력아이디
	public List<MatchingUserTrainerDto> reportPromotionList(String userId){
		List<MatchingUserTrainerDto> reportPromotionList = boardMapper.reportPromotionList(userId);
		System.out.println("흠흠"+reportPromotionList);
		return reportPromotionList;
	}
	
	public String reportBoardInsert(UserReportDto userReport) {
	int a = boardMapper.reportBoardInsert(userReport);
	
	String re = null;
	if (a > 0) {
		re = "등록성공";
	} else {
		re = "등록실패";
	}
	
	return re;
	}
}
