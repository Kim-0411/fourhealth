package com.fourhealth.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.fourhealth.service.MatchingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MatchingController {

    @Autowired
    private MatchingService matchingService;

    @PostMapping("/promotionPaymentCheck")
    public String checkPromotionPayment(@RequestParam(name = "userId", required = false) String userId,
            @RequestParam(name = "promotionNoticeCode", required = false) String promotionNoticeCode,
            HttpServletResponse response, Model model) throws IOException {

        System.out.println(userId);
        System.out.println(promotionNoticeCode);
        String re = matchingService.checkPromotionPayment(userId);
        int i = Integer.parseInt(re);
        if (i > 0) {
            model.addAttribute("promotionNoticeCode", promotionNoticeCode);
            return "main_layout/promotion/promotionPayment";
        } else {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('정보를 확인해주세요.'); location.href='/';</script>");
            out.flush();
            return "/";
        }
    }

}
