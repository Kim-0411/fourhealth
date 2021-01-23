package com.fourhealth.controller;

import java.util.List;
import java.util.Map;

import com.fourhealth.dto.MetExerciseDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.service.MemberService;
import com.fourhealth.service.PromotionService;
import com.fourhealth.service.ScheduleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/*
 * 스케쥴, 수행률
 */
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ScheduleController {

    @Autowired
    private PromotionService promotionService;
    @Autowired
    private ScheduleService scheduleService;

    // 프로모션 스케줄 등록페이지
    @GetMapping("/trainerScheduleInsert")
    public String trainerScheduleInsert(Model model) {
        // 로그인된 트레이너 아이디id002 가정
        List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList = promotionService
                .getTrainerMyPromotionAllList("id002");
        model.addAttribute("myPromotionList", getTrainerMyPromotionAllList);
        return "manage_layout/trainer/schedule/trainer_schedule_insert";
    }

    // 프로모션 스케줄 목록페이지
    @GetMapping("/trainerScheduleList")
    public String trainerScheduleList() {
        return "manage_layout/trainer/schedule/trainer_schedule_list";
    }

    // 프로모션 스케줄 수정페이지
    @GetMapping("/trainerScheduleModify")
    public String trainerScheduleModify() {
        return "manage_layout/trainer/schedule/trainer_schedule_modify";
    }

    // 프로모션 스케줄 삭제페이지
    @GetMapping("/trainerScheduleDelet")
    public String trainerScheduleDelet() {
        return "manage_layout/trainer/schedule/trainer_schedule_delet";
    }
    
	// 트레이너가 회원에게 운동 정보를 넣어주기 위해 사용되는 운동 데이터 검색 및 넣음.
	@RequestMapping(value = "/serachTrainerExercise", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody List<MetExerciseDto> serachTrainerExercise(@RequestParam Map<String, Object> map) {
		System.out.println(map);
		String exerciseName = (String) map.get("exerciseName");
		String metCoefficient = (String) map.get("exerciseHow");
		System.out.println(exerciseName + metCoefficient);
		List<MetExerciseDto> getExerciseList = scheduleService.getAllSearchExerciseList(exerciseName, metCoefficient);
		

		return getExerciseList;
	}
}
