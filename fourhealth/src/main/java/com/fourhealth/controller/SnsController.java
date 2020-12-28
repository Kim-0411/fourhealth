package com.fourhealth.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fourhealth.dto.Sns;
import com.fourhealth.service.SnsService;


@Controller
public class SnsController {
	
	@Autowired
	private SnsService snsService;
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("SnsController 객체 생성");
		System.out.println("======================================");
	}
	
	@RequestMapping(value = "/addSns", method = RequestMethod.POST)
	public String addSns(Sns sns
							,@RequestParam(name = "userSnsContents", required = false) String userSnsContents) {
		System.out.println("입력받은 값->" + sns);
		String result = snsService.addSns(sns);
		System.out.println(result);
		return "redirect:/snsList";
	}
	
	@GetMapping("/addSns")
	public String addSns(Model model) {
		model.addAttribute("title", "작성");
		
		return "sns/snsInsert";
	}
	
	@GetMapping("/snsList")
	public String getSnsList(Model model) {
		List<Sns> snsList = snsService.getSnsList();
		System.out.println(snsList);
		model.addAttribute("title","sns 목록");
		model.addAttribute("snsList",snsList);
		return "sns/snsList";
	}

}
