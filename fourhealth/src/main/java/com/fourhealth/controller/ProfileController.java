package com.fourhealth.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fourhealth.dto.CommonProfileDto;
import com.fourhealth.dto.CommonUserDto;
import com.fourhealth.service.CommonUserService;
import com.fourhealth.service.ProfileService;

/*
 *마이페이지 개인 정보 수정, 프로필 수정(프로필 이미지, 소개글 등)  
 */
@Controller
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private CommonUserService commonUserService;
	
	//트레이너 프로필 보기
	@GetMapping("/trainer/profile/trainerProfile")
	public String trainerProfile(Model model, @RequestParam(name = "result", required = false) String result) {
		List<CommonProfileDto> profile = profileService.getProfile();
		model.addAttribute("title", "프로필");
		model.addAttribute("profile", profile);
		return "manage_layout/trainer/profile/trainerProfile";
	}

	// 트레이너 프로필 수정페이지
	@GetMapping("trainer/profile/trainerProfileModify")
	public String trainerProfileModify(@RequestParam(name = "userId", required = false) String userId,
									   @RequestParam(name = "userPassword", required = false) String userPassword, 
									   Model model,HttpServletResponse response) throws IOException {
		CommonUserDto commonUserDto = commonUserService.getPrivateProfile();
		model.addAttribute("SID", userId);
		model.addAttribute("SNAME", userId);

		return "manage_layout/trainer/profile/trainer_profile_Modify";
	}
}
