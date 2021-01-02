package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.UserReportDto;

@Mapper
public interface BoardMapper {

	public List<UserReportDto> reportList();

	
}
