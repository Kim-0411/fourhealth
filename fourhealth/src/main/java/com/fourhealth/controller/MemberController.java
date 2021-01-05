package com.fourhealth.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fourhealth.dto.MsgDto;
import com.fourhealth.service.MessageService;

@Controller
public class MemberController {
	@Autowired
	private MessageService messageService;
	//트레이너 메인화면
	@GetMapping("mainTrainer")
	public String mainTrainer(Model model, HttpSession session) {
		//아이디 id002(트레이너) 로그인 가정 받은 메시지 메인화면에 메시지 버튼에 보여주기위함.
		//트레이너 메인 
		List<MsgDto> getAllNoReadMessage = messageService.getAllNoReadMessage("id002");
		session.setAttribute("noReadMessageCnt", getAllNoReadMessage.size());
		session.setAttribute("noReadMeg", getAllNoReadMessage);
		return "trainer/trainer_main";
	}
	

}
