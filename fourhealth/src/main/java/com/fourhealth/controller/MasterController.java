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

import com.fourhealth.dto.CommonUserDto;
import com.fourhealth.dto.MsgDto;
import com.fourhealth.service.*;

@Controller
public class MasterController {

	@Autowired
	private MessageService messageService;

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