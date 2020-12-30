package com.fourhealth.controller;

/*
 * 트레이너 가입 승인, 회원 공통권한별 레벨, 사용자 플랫폼 공통 관리 코드, 불량 트레이너, 탈퇴, 정산, 환불 승인 등등....
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fourhealth.dto.CommonUserDto;
import com.fourhealth.service.*;

@Controller
public class MasterController {
	@Autowired
	private MemberService memberService;

	
	//관리자 페이지 맵핑
	@GetMapping("/master_main")
	public String masterMain() {
		return "master/main";
	}

	@GetMapping("/memberlist")
	public String masterMemberList(Model model) {
		
		List<CommonUserDto> memberList = memberService.viewMember();
		model.addAttribute("memberList", memberList);

		System.out.println("전체회원 조회" + memberList);

		return "master/member/m_all_list";
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
