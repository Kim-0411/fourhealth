package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {

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
