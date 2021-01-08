package com.fourhealth.controller;

/*
 * 트레이너 가입 승인, 회원 공통권한별 레벨, 사용자 플랫폼 공통 관리 코드, 불량 트레이너, 탈퇴, 정산, 환불 승인 등등....
 */

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fourhealth.dto.CommonUserDto;
import com.fourhealth.dto.MemberDto;
import com.fourhealth.dto.MsgDto;
import com.fourhealth.service.*;

@Controller
public class MasterController {

	@Autowired
	private MessageService messageService;
	@Autowired
	private MemberService memberService;
	
	
	//관리자 단에서 전체 회원 리스트에서 회원 삭제  
	@GetMapping("/removeMasterMember")
	public String removeMasterMember( Model model
									,@RequestParam(name="memberId", required = false) String memberId
									,@RequestParam(name="memberLevel", required = false) String memberLevel) {
		model.addAttribute("title", "회원 삭제");
		model.addAttribute("memberId", memberId);
		model.addAttribute("memberLevel", memberLevel);
		return "master/member/member_remove";
	}


	//관리자 단에서 전체 회원 리스트에서 회원 삭제 처리 결과
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

	
	//관리자 단에서 전체 회원 리스트에서 수정페이지로 이동 
	@GetMapping("/modifyMasterMember")
	public String modifyMasterMember( Model model
							   		,@RequestParam(name="memberId", required = false) String memberId) {
		System.out.println("회원 수정 폼에 보여질 회원아이디" + memberId);
		MemberDto memberDto = memberService.getMemberById(memberId);		
		System.out.println("db에서 검색한 회원정보-->" + memberDto);
		model.addAttribute("title", "회원 수정화면");
		// db에서 검색한 회원정보
		model.addAttribute("memberDto", memberDto);
		System.out.println("Dto 값 확인" + memberDto);
		return "master/member/member_modify";
	}
	
	//관리자 단에서 전체 회원 수정페이지
	@PostMapping("/modifyMasterMember")
	public String modifyMasterMember(MemberDto memberDto) {
		System.out.println("회원 수정 폼에서 입력 받은 값" + memberDto);
		//modify 처리
		String result = memberService.modifyMasterMember(memberDto);
		//modify 결과
		System.out.println(result + "회원 수정 폼 결과");
		return "redirect:/member_all_list";
	}
	
	
	//관리자 단에서 전체 회원 리스트
	@GetMapping("/member_all_list")
	public String masterMemberList(Model model) {
		List<MemberDto> memberList = memberService.viewMember();
		model.addAttribute("title", "회원 목록");
		model.addAttribute("memberList", memberList);
		System.out.println("전체회원 조회" + memberList);
		// 관리자 전체 리스트
		return "master/member/member_all_list";
	}
	

	// 트레이너 / 관리자 메인화면
	@GetMapping("/manage")
	public String mainTrainer(Model model, HttpSession session) {
		// 아이디 id002(트레이너) 로그인 가정 받은 메시지 메인화면에 메시지 버튼에 보여주기위함.
		// 트레이너 메인
		List<MsgDto> getAllNoReadMessage = messageService.getAllNoReadMessage("id002");
		session.setAttribute("noReadMessageCnt", getAllNoReadMessage.size());
		session.setAttribute("noReadMeg", getAllNoReadMessage);
		return "manage_layout/manage_main";
	}

	/* 관리자 사용자 관리 페이지 맵핑 시작 */
	@GetMapping("/userList")
	public String userList(Model model) {
		return "manage_layout/master/user_manage/user_list";
	}

	@GetMapping("/userLoginList")
	public String userLoginList(Model model) {
		return "manage_layout/master/user_manage/user_login_list";
	}

	@GetMapping("/dormantUserList")
	public String dormantUserList(Model model) {
		return "manage_layout/master/user_manage/dormant_user_list";
	}
	/* 관리자 사용자 관리 페이지 맵핑 끝 */

	/* 관리자 트레이너 관리 페이지 맵핑 시작 */
	@GetMapping("/trainerList")
	public String trainerList(Model model) {
		return "manage_layout/master/trainer_manage/trainer_list";
	}

	@GetMapping("/trainerAccessList")
	public String trainerAccessList(Model model) {
		return "manage_layout/master/trainer_manage/trainer_Access_list";
	}

	@GetMapping("/trainerLoginList")
	public String trainerLoginList(Model model) {
		return "manage_layout/master/trainer_manage/trainer_login_list";
	}

	@GetMapping("/dormantTrainerList")
	public String dormantTrainerList(Model model) {
		return "manage_layout/master/trainer_manage/dormant_trainer_list";
	}

	/* 관리자 트레이너 관리 페이지 맵핑 끝 */

	/* 관리자 매칭 관리 페이지 맵핑 시작 */
	@GetMapping("/matchingList")
	public String matchingList(Model model) {
		return "manage_layout/master/matching_manage/matching_list";
	}

	@GetMapping("/matchingRefundList")
	public String matchingRefundList(Model model) {
		return "manage_layout/master/matching_manage/matching_refund_list";
	}

	/* 관리자 매칭 관리 페이지 맵핑 끝 */

	/* 관리자 질병DB 관리 페이지 맵핑 시작 */
	@GetMapping("/diseaseDataInsert")
	public String diseaseDataInsert(Model model) {
		return "manage_layout/master/disease_manage/disease_data_insert";
	}

	@GetMapping("/diseaseDataList")
	public String diseaseDataList(Model model) {
		return "manage_layout/master/disease_manage/disease_data_list";
	}

	@GetMapping("/diseaseDataModify")
	public String diseaseDataModify(Model model) {
		return "manage_layout/master/disease_manage/disease_data_modify";
	}
	/* 관리자 질병DB 관리 페이지 맵핑 끝 */

	/* 관리자 운동DB 관리 페이지 맵핑 시작 */
	@GetMapping("/exerciseDataInsert")
	public String exerciseDataInsert(Model model) {
		return "manage_layout/master/exercise_manage/exercise_data_insert";
	}

	@GetMapping("/exerciseDataList")
	public String exerciseDataList(Model model) {
		return "manage_layout/master/exercise_manage/exercise_data_list";
	}

	@GetMapping("/exerciseDataModify")
	public String exerciseDataModify(Model model) {
		return "manage_layout/master/exercise_manage/exercise_data_modify";
	}
	/* 관리자 운동DB 관리 페이지 맵핑 끝 */

	/* 관리자 음식DB 관리 페이지 맵핑 시작 */
	@GetMapping("/foodDataInsert")
	public String foodDataInsert(Model model) {
		return "manage_layout/master/food_manage/food_data_insert";
	}

	@GetMapping("/foodDataList")
	public String foodDataList(Model model) {
		return "manage_layout/master/food_manage/food_data_list";
	}

	@GetMapping("/foodDataModify")
	public String foodDataModify(Model model) {
		return "manage_layout/master/food_manage/food_data_modify";
	}
	/* 관리자 음식DB 관리 페이지 맵핑 끝 */

	/* 관리자 플렛폼 등급 관리 페이지 맵핑 시작 */
	@GetMapping("/userPlatformGrade")
	public String userPlatformGrade(Model model) {
		return "manage_layout/master/platform_manage/user_platform_grade";
	}

	@GetMapping("/trainerPlatformGrade")
	public String trainerPlatformGrade(Model model) {
		return "manage_layout/master/platform_manage/trainer_platform_grade";
	}
	/* 관리자 플렛폼 등급 관리 페이지 맵핑 끝 */

}