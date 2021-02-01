package com.fourhealth.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String trainerProfile(Model model) {
		CommonProfileDto profile = profileService.getProfile("id002");
		CommonUserDto commonUserDto = commonUserService.getPrivateProfile("id002");
		System.out.println(commonUserDto);
		System.out.println(profile);
		model.addAttribute("profile", profile);
		model.addAttribute(commonUserDto);
		return "manage_layout/trainer/profile/trainerProfile";
	}

	// 트레이너 개인정보 수정페이지
	@GetMapping("trainer/profile/trainerProfileModify")
	public String trainerPrivateProfileModify(Model model) {
		CommonProfileDto profile = profileService.getProfile("id002");
		CommonUserDto commonUserDto = commonUserService.getPrivateProfile("id002");
		System.out.println(commonUserDto);
		System.out.println(profile);
		model.addAttribute("profile", profile);
		model.addAttribute(commonUserDto);
		return "manage_layout/trainer/profile/trainer_profile_Modify";
	}
	//트레이너 개인정보 수정
	@PostMapping("trainer/profile/trainerProfileModify")
	public String trainerPrivateProfileModify(CommonUserDto commonUserDto) {
		System.out.println("입력 값"+commonUserDto);
		String result = commonUserService.modifyPrivateProfile(commonUserDto);
		System.out.println(result);
		return "redirect:/trainer/profile/trainerProfile";
	}
	
	//트레이너 프로필 수정 페이지
	//트레이너 프로필 수정
}
