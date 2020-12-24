package com.fourhealth.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.fourhealth.dto.Member;
import com.fourhealth.service.MemberService;


@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService; 
	
	@PostMapping(value = "/addMember2")
	public String addMember(Member member
							,@RequestParam(name = "memberId", required = false) String memberId ,
							 HttpServletResponse response ) throws IOException {
		System.out.println("회원가입화면에서 입력받은 값--->" + member);
		
		String userLevel = member.getUserLevel();
		  if(userLevel.equals("trainer")){
		   member.setUserLevel("user_level_002");
		  }else if (userLevel.equals("user")) {
			member.setUserLevel("user_level_003");
		  }else {
			member.setUserLevel("user_level_001");
		  }
		  System.out.println("회원가입화면에서 입력후 레벨값 수정--->" + member);

		
		 
		  String result = memberService.addMember(member); 
		 
		  response.setContentType("text/html; charset=UTF-8");
	      PrintWriter out = response.getWriter();
		 if(result.equals("회원가입 성공")) {
			 out.println("<script>alert('회원가입을 축하드립니다.'); location.href='/';</script>");
			 out.flush(); 
		 }else {
			 out.println("<script>alert('회원가입에 실패했습니다.'); location.href='/addMember';</script>");
			 out.flush(); 
		}
	
		return "member/memberList";
	}
	

	@GetMapping("/addMember") 
	public String addMember(Model model) {
		model.addAttribute("title", "회원 가입");
		
		return "member/mInsert";
		}
	
	
}
