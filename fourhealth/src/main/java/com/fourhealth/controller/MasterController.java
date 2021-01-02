package com.fourhealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fourhealth.service.MemberService;

@Controller
public class MasterController {
	@Autowired
	private MemberService memberService;
	
}
