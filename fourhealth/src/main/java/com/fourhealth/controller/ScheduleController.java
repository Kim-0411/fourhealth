package com.fourhealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fourhealth.dto.UserDto;
import com.fourhealth.service.MemberService;

@Controller
public class ScheduleController {
	
	@Autowired
	private MemberService memberService;

	// 스케줄 등록해주는 페이지 (일단운동) 필요한거 매칭된 회원의 키 몸무게
	@GetMapping("/trainerMemberScheduleInsert")
	public String MemberScheduleInsert(Model model,
									  @RequestParam(name = "userId", required = false) String userId) {
			UserDto getUserInfo = memberService.getTrainerMyMatchingUserInfo(userId);
			model.addAttribute("userInfo", getUserInfo);
			return"trainer/my_promotion_member_insert_exercise.html"; 
	}



}
