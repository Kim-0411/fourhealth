package com.fourhealth.controller;

/*
 * 스케쥴, 수행률
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {

    @GetMapping("/master_user_schedule")
    public String masterUserSchedule(Model model) {
        // 관리자 유저 스케쥴 화면
        return "master/schedule/user_schedule";
    }
}
