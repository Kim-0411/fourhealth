package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EtcController {

	// 트레이너가 자신의 프로모션 별 메시지 보내주기 위한 화면
	@GetMapping("/trainerSendMessage")
	public String trainerSendMessage(Model model) {
		return "trainer_layout/massage/trainer_massage_send";
	}

	// 보낸 메시지 관리
	@GetMapping("/trainerMessageSendManage")
	public String trainerMessageSendMange(Model model) {
		return "trainer_layout/massage/trainer_message_send_management";
	}

	// 트레이너 받은 메시지 관리
	@GetMapping("/trainerMessageReceiveManage")
	public String trainerReceiveMessage(Model model) {
		return "trainer_layout/massage/trainer_message_receive_management";
	}

	// 보낸메시지 읽기
	@GetMapping("/trainerSendMessageRead")
	public String trainerSendMessageRead(Model model,
			@RequestParam(name = "msgCode", required = false) String msgCode) {
		return "trainer_layout/massage/trainer_send_message_read";
	}

	// 받은메시지 읽기및 읽음처리
	@GetMapping("/trainerReceiveMessageRead")
	public String trainerReceiveMessageRead(Model model,
			@RequestParam(name = "msgCode", required = false) String msgCode) {
		return "trainer_layout/massage/trainer_receive_message_read";
	}

	// 트레이너 프로필 등록페이지
	@GetMapping("/trainerProfileInsert")
	public String trainerProfileInsert() {
		return "trainer_layout/profile/trainer_profile_insert";
	}

	// 트레이너 프로필 확인페이지
	@GetMapping("/trainerProfile")
	public String trainerProfile() {
		return "trainer_layout/profile/trainer_profile_insert";
	}

	// 트레이너 프로필 수정페이지
	@GetMapping("/trainerProfileModify")
	public String trainerProfileModify() {
		return "trainer_layout/profile/trainer_profile_Modify";
	}

}
