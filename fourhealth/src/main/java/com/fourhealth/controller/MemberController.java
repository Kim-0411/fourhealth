package com.fourhealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.fourhealth.dto.Member;
import com.fourhealth.service.MemberService;


@Controller
public class MemberController {
	/*
	 * @Autowired private MemberService memberService;
	 */
	
	@Autowired
	private MemberService memberService; 
	
	
	@RequestMapping(value = "/addMember", method = RequestMethod.POST)
	public String addMember(Member member
							,@RequestParam(name = "memberId", required = false) String memberId) {
		System.out.println("회원가입화면에서 입력받은 값--->" + member);
		String result = memberService.addMember(member);
		System.out.println(result);
		return "redirect:/memberList";
	}
	

	@GetMapping("/addMember") 
	public String addMember(Model model) {
		model.addAttribute("title", "회원 가입");
		
		return "member/mInsert";
		}
	
	
}
