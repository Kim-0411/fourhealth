package com.fourhealth.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourhealth.dto.MsgDto;
import com.fourhealth.service.MatchingService;
import com.fourhealth.service.MessageService;
import com.fourhealth.service.PromotionService;

@Controller
public class EtcController {

	@Autowired
	PromotionService promotionService;
	@Autowired
	MatchingService matchingService;
	@Autowired
	MessageService messageService;

	//로그인 없이 봣을시 root처리
	@GetMapping("trainerSendMessage")
	public String trainerSendMessage(Model model,
									@RequestParam(name = "receiveId", required = false, defaultValue = "") String receiveId
									,HttpSession session) {
		if(session.getAttribute("SID") == null) {
			model.addAttribute("memberId","root");
		}else {
			//로그인됫을시 수정함.
			model.addAttribute("memberId",(String)session.getAttribute("SID"));
		}
		model.addAttribute("reply", receiveId);
		System.out.println(receiveId);
		return "manage_layout/trainer/message/trainer_message_send";
	}

	//로그인 없이 쪽지 보낼시 id002 아니면 세션값
	@PostMapping("sendTrainerSelectPromotionMember")
	public String sendTrainerSelectPromotionMember(MsgDto msg, HttpServletResponse response) throws IOException {
		String result = null;
		if(msg.getSendId()==null) {
			msg.setSendId("root");
			result = messageService.sendTrainerToUser(msg);
		}else {
			 result = messageService.sendTrainerToUser(msg);
		}
		System.out.println(result);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (result.equals("성공")) {
			out.println("<script>alert('성공적으로 메시지가 전송되었습니다.');location.href='/manage';</script>");
			out.flush();
		} else {
			out.println("<script>alert('실패.');location.href='/manage';</script>");
			out.flush();
		}

		return null;
	}

	//보낸 메시지 관리
	@GetMapping("trainerMessageSendManage")
	public String trainerMessageSendMange(Model model,HttpSession session) {
		List<MsgDto> getAllSendMessageList = null;
		if(session.getAttribute("SID") == null) {
		 getAllSendMessageList = messageService.getAllSendMessageList("root");
		}else {
			 getAllSendMessageList = messageService.getAllSendMessageList((String)session.getAttribute("SID"));
		}
		model.addAttribute("sendMsg", getAllSendMessageList);
		return "manage_layout/trainer/message/trainer_message_send_management";
	}

	// 트레이너가 메시지 보낸거 발송취소
	@RequestMapping(value = "/cancelMsg", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody int cancelTrainerMessage(@RequestParam Map<String, Object> map) {
		String msgCode = (String) map.get("msgCode");
		System.out.println(msgCode);
		int cancelMsg = messageService.modifyAllcancelMsg(msgCode);

		return cancelMsg;
	}

	// 트레이너 받은 메시지 관리
	@GetMapping("trainerMessageReceiveManage")
	public String trainerReceiveMessage(Model model, HttpSession session) {
		List<MsgDto> getAllReceiveMessageList = null;
		if(session.getAttribute("SID") == null) {
			 getAllReceiveMessageList = messageService.getAllReceiveMessageList("root");
		}else {
			getAllReceiveMessageList = messageService.getAllReceiveMessageList((String)session.getAttribute("SID"));
			
		}
		model.addAttribute("receiveMsg", getAllReceiveMessageList);
		return "manage_layout/trainer/message/trainer_message_receive_management";
	}

	// 보낸메시지 읽기
	@GetMapping("trainerSendMessageRead")
	public String trainerSendMessageRead(Model model,
			@RequestParam(name = "msgCode", required = false) String msgCode) {
		MsgDto getAllSendMessageInfo = messageService.getAllSendMessageInfo(msgCode);
		model.addAttribute("msgInfo", getAllSendMessageInfo);
		return "manage_layout/trainer/message/trainer_send_message_read";
	}

	// 받은메시지 읽기및 읽음처리
	@GetMapping("trainerReceiveMessageRead")
	public String trainerReceiveMessageRead(Model model,
			@RequestParam(name = "msgCode", required = false) String msgCode) {
		MsgDto getAllSendMessageInfo = messageService.getAllSendMessageInfo(msgCode);
		String result = messageService.getAllMessageReadPro(msgCode);
		System.out.println(result);
		model.addAttribute("msgInfo", getAllSendMessageInfo);
		return "manage_layout/trainer/message/trainer_receive_message_read";
	}

	// 트레이너 프로필 등록페이지
	@GetMapping("/trainerProfileInsert")
	public String trainerProfileInsert() {
		return "manage_layout/trainer/profile/trainer_profile_insert";
	}

	// 트레이너 프로필 수정페이지
	@GetMapping("/trainerProfileModify")
	public String trainerProfileModify() {
		return "manage_layout/trainer/profile/trainer_profile_Modify";
	}

}
