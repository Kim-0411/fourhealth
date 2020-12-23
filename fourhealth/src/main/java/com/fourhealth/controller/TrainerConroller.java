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

import com.fourhealth.dto.MatchingUserTrainer;
import com.fourhealth.dto.MetExercise;
import com.fourhealth.dto.NoticePromotionTrainer;
import com.fourhealth.dto.User;
import com.fourhealth.service.ExerciseService;
import com.fourhealth.service.MatchingUserTrainerService;
/*import com.fourhealth.service.MatchingUserTrainerService;*/
import com.fourhealth.service.NoticePromotionTrainerService;

@Controller
public class TrainerConroller {
	
	@Autowired
	private MatchingUserTrainerService matchingUserTrainerService;
	@Autowired
	private NoticePromotionTrainerService noticePromotionTrainerService;
	@Autowired
	private ExerciseService exerciseService;

	//로그인됫다고 가정
	@GetMapping("/myPromotion")
	public String getMyPromotionList(Model model) {
		//아이디 있다고 가정 결제할때 하나씩 증가시켜줘야하는데 결제 하는거보고 하기로.
		/*
		 * String result = matchingUserTrainerService.MatchingUserTrainerCount("id002");
		 */
		List<NoticePromotionTrainer> myPromotionList = noticePromotionTrainerService.getMyPromotionList("id002");
		model.addAttribute("myPromotionList",myPromotionList);
		return "trainer/my_promotion_list";
	}
	//로그인 됫다고 가정후 트레이너 프로모션중 내 프로모션중에 하나 골라서 접근할때 거기에결제된 놈들 
	@GetMapping("/myPromotionMemberList")
	public String getMyPromotionMemberList(Model model
											,@RequestParam(name ="promotionCode", required = false) String promotionCode) {
		List<MatchingUserTrainer> getMemberList = matchingUserTrainerService.getMatchingUserList(promotionCode);
		System.out.println(getMemberList);
		model.addAttribute("memberList",getMemberList);
		return "trainer/my_promotion_member_list";
	}
	
	//스케줄 등록해주는 페이지 (일단운동) 필요한거 매칭된 회원의 키 몸무게 
	@GetMapping("/scheduleInsert")
	public String MemberScheduleInsert(Model model
										,@RequestParam(name = "userId",required = false)String userId) {
		User getUserInfo = matchingUserTrainerService.getUserInfo(userId);
		model.addAttribute("userInfo",getUserInfo);
		return "trainer/member_schedule_insert";
	}
	
	//내회원 스케줄 넣어줄때 운동정보 가져올때 
	@RequestMapping(value = "/exerciseAdd", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody List<MetExercise> getExerciseList(@RequestParam Map<String, Object> map){
		System.out.println(map);
		String exerciseName = (String)map.get("exerciseName");
		String metCoefficient = (String)map.get("exerciseHow");
		System.out.println(exerciseName+metCoefficient);
		List<MetExercise> getExerciseList = exerciseService.getSearchExercise(exerciseName, metCoefficient);
		
		return getExerciseList;
}
}
