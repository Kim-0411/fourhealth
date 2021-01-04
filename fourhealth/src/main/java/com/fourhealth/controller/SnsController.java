package com.fourhealth.controller;

/*
 * SNS 관련
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.dto.SnsUserDto;
import com.fourhealth.service.SnsService;


@Controller
public class SnsController {
	
	@Autowired
	private SnsService snsService;
	
	@PostMapping("/snsInsert")
	public String snsInsert(SnsUserDto snsUserDto) {
		System.out.println("폼에서 입력받은 값" + snsUserDto);
		String result = snsService.snsInsert(snsUserDto);
		System.out.println(result);
		return "redirect:/sns";
	}
	
	@GetMapping("/snsInsert")
	public String snsInsert() {
		return "sns/snsInsert";
	}

	@GetMapping("/sns")
	public String snsList(Model model) {
		snsService.getSnsList();
		List<SnsUserDto> snsList = snsService.getSnsList();
		System.out.println(snsList.toString());
		model.addAttribute("snsList",snsList);
		return "sns/snsList";
	}
}
