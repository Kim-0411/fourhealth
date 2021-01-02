package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.CategoriesReportDto;
import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.UserReportDto;

@Mapper
public interface BoardMapper {

	public List<UserReportDto> reportList();

	public List<CategoriesReportDto> reportReasonList();
	
	public List<MatchingUserTrainerDto> reportPromotionList(String userId);
}
