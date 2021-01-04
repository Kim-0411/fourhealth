package com.fourhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fourhealth.dto.MemberDto;
import com.fourhealth.service.*;

@Controller
public class MasterController {
	@Autowired
	private MemberService memberService;
	
	
	//관리자 회원 삭제  
	@GetMapping("/removeMasterMember")
	public String removeMasterMember( Model model
									,@RequestParam(name="memberId", required = false) String memberId
									,@RequestParam(name="memberLevel", required = false) String memberLevel) {
		model.addAttribute("title", "회원 탈퇴");
		model.addAttribute("memberId", memberId);
		model.addAttribute("memberLevel", memberLevel);
		return "master/member/member_remove";
	}
	
	//관리자 회원 삭제
	@PostMapping("/removeMasterMember")
	public String removeMasterMember(@RequestParam(name="memberId", required = false) String memberId
									,@RequestParam(name="memberPw", required = false) String memberPw
									,@RequestParam(name="memberLevel", required = false) String memberLevel
									,RedirectAttributes redirectAttr) {
		System.out.println("회원삭제화면에서 입력받은 값(id)--->"	+ memberId);
		System.out.println("회원삭제화면에서 입력받은 값(pw)--->"	+ memberPw);
		System.out.println("회원삭제화면에서 입력받은 값(level)--->"+ memberLevel);
		
		//서비스계층에서 권한 별 삭제 처리 후 결과 
		String result = memberService.removeMasterMember(memberId, memberPw, memberLevel);
		
		System.out.println(result + "삭제 처리 후 결과");
		redirectAttr.addAttribute("result", result);
		return "redirect:/member_all_list";
	}

	
	//관리자 전체 회원 리스트에서 수정 후 
	@GetMapping("/modifyMasterMember")
	public String modifyMasterMember( Model model
							   ,@RequestParam(name="memberId", required = false) String memberId) {
		System.out.println("회원 수정 폼에 보여질 회원아이디" + memberId);
		MemberDto memberDto = memberService.getMemberById(memberId);		
		System.out.println("db에서 검색한 회원정보-->" + memberDto);
		model.addAttribute("title", "회원 수정화면");
		// db에서 검색한 회원정보
		model.addAttribute("memberDto", memberDto);
		System.out.println("dto 값 확인" + memberDto);
		return "master/member/member_modify";
	}
	
	//관리자 전체 회원 수정페이지
	@PostMapping("/modifyMasterMember")
	public String modifyMasterMember(MemberDto memberDto) {
		System.out.println("회원 수정 폼에서 입력 받은 값" + memberDto);
		//modify 처리
		String result = memberService.modifyMasterMember(memberDto);
		//modify 결과
		System.out.println(result + "회원 수정 폼 결과");
		return "redirect:/member_all_list";
	}
	
	//관리자 페이지 맵핑
	@GetMapping("/master_main")
	public String masterMain() {
		return "master/main";
	}
	
	//관리자 페이지 회원 전체 정보 조회
	@GetMapping("/member_all_list")
	public String masterMemberList(Model model) {
		List<MemberDto> memberList = memberService.viewMember();
		model.addAttribute("title", "회원 목록");
		model.addAttribute("memberList", memberList);
		System.out.println("전체회원 조회" + memberList);
		
		return "master/member/member_all_list";
	}

	@GetMapping("/profile_details")
	public String masterProfileDetails(Model model) {
		// 관리자 프로필 상세조회 화면
		return "master/profile/profile_details";
	}

	@GetMapping("/profile_modify")
	public String masterProfileModify(Model model) {
		// 관리자 프로필 수정 화면
		return "master/profile/profile_modify";
	}

	@GetMapping("/bank_number_details")
	public String masterbankNumberDetails(Model model) {
		// 관리자 계좌 상세조회 화면
		return "master/payment/bank_number_details";
	}

	@GetMapping("/bank_number_modify")
	public String masterbankNumberModified(Model model) {
		// 관리자 계좌 수정 화면
		return "master/payment/bank_number_modify";
	}

	@GetMapping("/settlement_list")
	public String masterSettlementList(Model model) {
		// 관리자 정산 조회 화면
		return "master/payment/settlement_list";
	}

	@GetMapping("/inactive_accounts_list")
	public String masterInactiveAccountsMemberList(Model model) {
		// 관리자 휴면계정 조회 화면
		return "master/member/member_inactive_accounts_list";
	}

	@GetMapping("/dormant_list")
	public String masterDormantMemberList(Model model) {
		// 관리자 탈퇴계정 조회 화면
		return "master/member/member_dormant_list";
	}
}
