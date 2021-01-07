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
}