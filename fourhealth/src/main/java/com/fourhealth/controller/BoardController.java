package com.fourhealth.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

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

	// 문의 등록화면으로 가는 겟매핑
	@GetMapping("board/inquiryInsert")
	public String inquiryInsertForm(String userId, Model model) {

		return "main_layout/board/inquiryInsert";
	}

	// 신고 등록 폼으로 가기 위한 매핑
	@RequestMapping("/board/reportInsert")
	public String reportBoardInsertForm( Model model) {
		List<MatchingUserTrainerDto> reportPromotionList;
		model.addAttribute("title", "신고 등록");
			reportPromotionList = boardService
					.reportPromotionList("id001");
			model.addAttribute("reportPromotionList", reportPromotionList);
		return "main_layout/board/reportInsert";
	}

	// 신고 등록 처리 매핑
	@RequestMapping("/reportInsertProc")
	public String reportBoardInsert(UserReportDto userReport) {
		String result = boardService.reportBoardInsert(userReport);

		return "/index";
	}

}
