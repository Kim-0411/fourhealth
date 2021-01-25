package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * 종합 게시판(신고, 문의, 등등...)
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fourhealth.dto.CategoriesReportDto;
import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.UserReportDto;
import com.fourhealth.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	/*신고게시판 메인화면으로 가는 겟매핑*/
	@GetMapping("/reportBoardMain")
	public String ReportBoardMain(Model model) {
		model.addAttribute("title", "신고게시판");
		return "/main_layout/board/report_main";
	}
	
	//신고 폼으로 가기 위한 매핑
	@RequestMapping("/reportInsert")
	public String reportBoardInsertForm(String userId, Model model) {
		model.addAttribute("title","신고 등록");
		System.out.println("제발 좀 떠봐라 슈바꺼"+userId);
		List<MatchingUserTrainerDto> reportPromotionList = boardService.reportPromotionList(userId);
		model.addAttribute("reportPromotionList",reportPromotionList);
		return "/main_layout/board/reportInsert";
	}
	
	//신고 등록 처리 매핑 
	@RequestMapping("/reportInsertProc")
	public String reportBoardInsert(UserReportDto userReport) {
		String result = boardService.reportBoardInsert(userReport);
		
		return "redirect:/reportBoardMain";
	}
	//문의 게시판으로 가기 위한 매핑
	@GetMapping("inquiryInsert")
	public String inquiryInsertForm(String userId, Model model) {
		model.addAttribute("title","문의 등록");
		System.out.println("제발 떠랏 " + userId);
		
		return "/main_layout/board/inquiryInsert";
	}
}
