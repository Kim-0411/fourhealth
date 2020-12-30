package com.fourhealth.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fourhealth.dto.MemberDto;
import com.fourhealth.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	/********************************************************************************************
	 * 로그인/로그아웃
	 ********************************************************************************************/

	// 로그인 화면(공통)
	@GetMapping("/login")
	public String commonLoginPage(Model model, @RequestParam(name = "result", required = false) String result) {
		model.addAttribute("title", "로그인 화면");

		if (result != null)
			model.addAttribute("result", result);

		return "main_layout/login/login";
	}

	// 로그인 처리(공통)
	@PostMapping("/login")
	public String commonLoginPro(@RequestParam(name = "userId", required = false) String userId,
			@RequestParam(name = "userPassword", required = false) String userPassword, HttpSession session,
			RedirectAttributes rAttr) {

		System.out.println("로그인 화면에서 입력받은 값->" + userId);
		System.out.println("로그인 화면에서 입력받은 값->" + userPassword);

		MemberDto member = memberService.getMemberById(userId);

		if (userId != null && userPassword != null && member != null && member.getMemberPw() != null
				&& userPassword.equals(member.getMemberPw())) {
			session.setAttribute("SID", userId);
			session.setAttribute("SLEVEL", member.getMemberLevel());
			session.setAttribute("SNAME", member.getMemberName());

			System.out.println(userId + " : 로그인 성공");
		} else {
			rAttr.addAttribute("result", "입력하신 정보는 없습니다.");
			System.out.println(userId + " : 로그인 실패");
			return "redirect:/login";
		}

		return "redirect:/";
	}

	// 로그아웃(공통)
	@GetMapping("/logout")
	public String commonLogoutPro(HttpSession session) {

		session.invalidate();

		return "redirect:/login";
	}

}
