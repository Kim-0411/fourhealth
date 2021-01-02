package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fourhealth.dto.UserReportDto;
import com.fourhealth.service.ReportService;

@Controller
public class ReportController {
	@Autowired
	private ReportService reportService;
	
	//신고게시판 전체리스트
	@GetMapping("/reportList")
	public String reportList(Model model) {
		List<UserReportDto> reportList = reportService.reportList();
		System.out.println(reportList);
		model.addAttribute("reportList", reportList);
		return "report_board/reportList";
	}
	
}
