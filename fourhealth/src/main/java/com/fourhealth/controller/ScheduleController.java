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
	@GetMapping("/trainerInsertMemberSchedule")
	public String trainerInsertMemberSchedule(Model model,
									  @RequestParam(name = "userId", required = false) String userId) {
			UserDto getUserInfo = memberService.getTrainerMyMatchingUserInfo(userId);
			System.out.println(getUserInfo);
			model.addAttribute("userInfo", getUserInfo);
			return"trainer/my_promotion_member_insert_exercise"; 
	}
	
	  // 프로모션 스케줄 등록페이지
    @GetMapping("/trainerScheduleInsert")
    public String trainerScheduleInsert() {
        return "trainer_layout/schedule/trainer_schedule_insert";
    }

    // 프로모션 스케줄 목록페이지
    @GetMapping("/trainerScheduleList")
    public String trainerScheduleList() {
        return "trainer_layout/schedule/trainer_schedule_list";
    }

    // 프로모션 스케줄 수정페이지
    @GetMapping("/trainerScheduleModify")
    public String trainerScheduleModify() {
        return "trainer_layout/schedule/trainer_schedule_modify";
    }

    // 프로모션 스케줄 삭제페이지
    @GetMapping("/trainerScheduleDelet")
    public String trainerScheduleDelet() {
        return "trainer_layout/schedule/trainer_schedule_delet";
    }



}
