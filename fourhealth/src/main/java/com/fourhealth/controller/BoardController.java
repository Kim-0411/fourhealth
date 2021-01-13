package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * 종합 게시판(신고, 문의, 등등...)
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fourhealth.dto.CategoriesReportDto;
import com.fourhealth.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/reportBoard")
	public ModelAndView reportBoardList() {
		ModelAndView mv = new ModelAndView("/main_layout/report_main");
		
		List<CategoriesReportDto> list = boardService.selectReportBoardList();
		mv.addObject("list", list);
		return mv;
	}
	
}
