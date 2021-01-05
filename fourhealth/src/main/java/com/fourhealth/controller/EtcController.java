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
	

	//트레이너가 자신의 프로모션 별 메시지 보내주기 위한 화면 
	@GetMapping("trainerSendMessage")
	public String trainerSendMessage(Model model) {
		//id002트레이너 가정 로그인 프로세스 완료시 바꿔야함 
		model.addAttribute("trainerId","id002");
		return "trainer_layout/massage/trainer_massage_send";
	}
	
	//트레이너가 회원에게 쪽지 보내기.
	@PostMapping("sendTrainerSelectPromotionMember")
	public String sendTrainerSelectPromotionMember(MsgDto msg,HttpServletResponse response) throws IOException {
		
		String result = messageService.sendTrainerToUser(msg);
		System.out.println(result);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if(result.equals("성공")) {
			out.println("<script>alert('성공적으로 메시지가 전송되었습니다.');location.href='/mainTrainer';</script>");
			out.flush(); 
		}else {
			out.println("<script>alert('실패.');location.href='/mainTrainer';</script>");
			out.flush(); 
		}

		return null;
	}
	//보낸 메시지 관리
	@GetMapping("trainerMessageSendManage")
	public String trainerMessageSendMange(Model model) {
		//트레이너 로그인 id002가정
		List<MsgDto> getAllSendMessageList = messageService.getAllSendMessageList("id002");
		model.addAttribute("sendMsg",getAllSendMessageList);
		return "trainer_layout/massage/trainer_message_send_management";
	}
	
	
	//트레이너가 메시지 보낸거 발송취소
	@RequestMapping(value = "/cancelMsg", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody int cancelTrainerMessage(@RequestParam Map<String, Object> map) {
		String msgCode = (String) map.get("msgCode");
		System.out.println(msgCode);
		int cancelMsg = messageService.modifyAllcancelMsg(msgCode);
	
		return cancelMsg;
	}
	
	//트레이너 받은 메시지 관리
	@GetMapping("trainerMessageReceiveManage")
	public String trainerReceiveMessage(Model model) {
		//트레이너 로그인 id002가정
		List<MsgDto> getAllReceiveMessageList = messageService.getAllReceiveMessageList("id002");
		model.addAttribute("receiveMsg",getAllReceiveMessageList);
		return "trainer_layout/massage/trainer_message_receive_management";
	}
	//보낸메시지 읽기
	@GetMapping("trainerSendMessageRead")
	public String trainerSendMessageRead(Model model
									,@RequestParam(name = "msgCode",required = false) String msgCode) {
		MsgDto getAllSendMessageInfo = messageService.getAllSendMessageInfo(msgCode);
		model.addAttribute("msgInfo" ,getAllSendMessageInfo);
		return "trainer_layout/massage/trainer_send_message_read";
	}
	//받은메시지 읽기및 읽음처리
	@GetMapping("trainerReceiveMessageRead")
	public String trainerReceiveMessageRead(Model model
											,@RequestParam(name = "msgCode",required = false) String msgCode) {
		MsgDto getAllSendMessageInfo = messageService.getAllSendMessageInfo(msgCode);
		String result = messageService.getAllMessageReadPro(msgCode);
		System.out.println(result);
		model.addAttribute("msgInfo" ,getAllSendMessageInfo);
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
