package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fourhealth.dto.DiseaseDto;
import com.fourhealth.service.DiseaseService;

@Controller
public class DiseaseController {

	@Autowired
	private DiseaseService diseaseService;
	
	@GetMapping("/disease")
	public String diseasePage(){
		
		return "main_layout/disease/diseaseList";
	}
}
