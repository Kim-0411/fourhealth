package com.fourhealth.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

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

	// 트레이너가 자신의 프로모션 별 메시지 보내주기 위한 화면
	@GetMapping("trainer/message/trainerSendMessage")
	public String trainerSendMessage(Model model,
			@RequestParam(name = "receiveId", required = false, defaultValue = "") String receiveId) {
		// id002트레이너 가정 로그인 프로세스 완료시 바꿔야함
		model.addAttribute("trainerId", "id002");
		model.addAttribute("reply", receiveId);
		System.out.println(receiveId);
		return "manage_layout/trainer/message/trainer_message_send";
	}

	// 트레이너가 회원에게 쪽지 보내기.
	@PostMapping("trainer/message/sendTrainerSelectPromotionMember")
	public String sendTrainerSelectPromotionMember(MsgDto msg, HttpServletResponse response) throws IOException {
		if(msg.getSendId().equals("")){
			msg.setSendId("id002");
		}

		String result = messageService.sendTrainerToUser(msg);
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

	// 보낸 메시지 관리
	@GetMapping("trainer/message/trainerMessageSendManage")
	public String trainerMessageSendMange(Model model) {
		// 트레이너 로그인 id002가정
		List<MsgDto> getAllSendMessageList = messageService.getAllSendMessageList("id002");
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
	@GetMapping("trainer/message/trainerMessageReceiveManage")
	public String trainerReceiveMessage(Model model) {
		// 트레이너 로그인 id002가정
		List<MsgDto> getAllReceiveMessageList = messageService.getAllReceiveMessageList("id002");
		model.addAttribute("receiveMsg", getAllReceiveMessageList);
		return "manage_layout/trainer/message/trainer_message_receive_management";
	}

	// 보낸메시지 읽기
	@GetMapping("trainer/message/trainerSendMessageRead")
	public String trainerSendMessageRead(Model model,
			@RequestParam(name = "msgCode", required = false) String msgCode) {
		MsgDto getAllSendMessageInfo = messageService.getAllSendMessageInfo(msgCode);
		model.addAttribute("msgInfo", getAllSendMessageInfo);
		return "manage_layout/trainer/message/trainer_send_message_read";
	}

	// 받은메시지 읽기및 읽음처리
	@GetMapping("trainer/message/trainerReceiveMessageRead")
	public String trainerReceiveMessageRead(Model model,
			@RequestParam(name = "msgCode", required = false) String msgCode) {
		MsgDto getAllSendMessageInfo = messageService.getAllSendMessageInfo(msgCode);
		String result = messageService.getAllMessageReadPro(msgCode);
		System.out.println(result);
		model.addAttribute("msgInfo", getAllSendMessageInfo);
		return "manage_layout/trainer/message/trainer_receive_message_read";
	}

}
