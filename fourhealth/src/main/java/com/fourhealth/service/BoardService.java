package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.CategoriesReportDto;
import com.fourhealth.mapper.BoardMapper;

@Service
@Transactional
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	
	public List<CategoriesReportDto> selectReportBoardList() {
		List<CategoriesReportDto> selectReportBoardList = boardMapper.selectReportBoardList();
		return selectReportBoardList();
	}

}
