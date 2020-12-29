package com.fourhealth.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.MetExerciseDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.dto.UserDto;
import com.fourhealth.service.ExerciseService;
import com.fourhealth.service.MemberService;

@Controller
public class MemberController {
	//트레이너 메인화면
	@GetMapping("mainTrainer")
	public String mainTrainer() {
		return "trainer/trainer_main";
	}


}
