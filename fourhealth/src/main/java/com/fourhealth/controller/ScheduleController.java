package com.fourhealth.controller;

import java.util.List;

import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.service.MemberService;
import com.fourhealth.service.PromotionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
 * 스케쥴, 수행률
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {

    @Autowired
    private MemberService memberService;
    @Autowired
    private PromotionService promotionService;

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
}
