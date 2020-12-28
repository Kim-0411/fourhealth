package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromotionController {

    @GetMapping("/promotion_progress_list")
    public String masterPromotionProgressList(Model model) {
        // 관리자 진행중인 프로모션 조회 화면
        return "master/promotion/promotion_progress";
    }

    @GetMapping("/promotion_completion_list")
    public String masterPromotionCompletionList(Model model) {
        // 관리자 완료된 프로모션 조회 화면
        return "master/promotion/promotion_completion_list";
    }

}
