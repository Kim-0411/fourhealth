package com.fourhealth.mapper;

import java.util.List;

/*
 * 종합 게시판(신고, 문의, 등등...)
 */

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.CategoriesReportDto;

@Mapper
public interface BoardMapper {

	List<CategoriesReportDto> selectReportBoardList();
}
