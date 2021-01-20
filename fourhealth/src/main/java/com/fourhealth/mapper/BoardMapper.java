package com.fourhealth.mapper;

import java.util.List;

/*
 * 종합 게시판(신고, 문의, 등등...)
 */

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.UserReportDto;


@Mapper
public interface BoardMapper {

	public int reportBoardInsert(UserReportDto userReport); 
	//나의 프로모션 가져오기
	public List<MatchingUserTrainerDto> reportPromotionList(String userId);
	
}
