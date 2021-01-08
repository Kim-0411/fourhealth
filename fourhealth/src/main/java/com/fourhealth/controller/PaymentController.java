package com.fourhealth.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.service.PaymentService;
import com.fourhealth.service.PromotionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Autowired
    PromotionService promotionService;

    @PostMapping("/promotionPaymentCheck")
    public String promotionPaymentCheck(@RequestParam(name = "userId", required = false) String userId,
            @RequestParam(name = "promotionNoticeCode", required = false) String promotionNoticeCode,
            HttpServletResponse response) throws IOException {

        // html에서 받아온 파라미터 값 확인
        System.out.println(userId + "----------->로그인된 id값 가져오기");
        System.out.println(promotionNoticeCode + "----------->사용자가 클릭한 프로모션 코드값 가져오기");

        // 유저가 최초 데이터를 작성했는지에 대한 체크
        String re = paymentService.checkPromotionPayment(userId);
        int a = Integer.parseInt(re);

        // 유저가 선택한 프로모션이 현재 인원이 가득 찾는지에 대한 데이터 추출
        NoticePromotionTrainerDto promotionDTO = promotionService.promotionDetail(promotionNoticeCode);
        int trainerPromotionLiveAddPeople = promotionDTO.getTrainerPromotionLiveAddPeople();
        int trainerPromotionRecruitPeople = promotionDTO.getTrainerPromotionRecruitPeople();

        if (userId.equals("")) {
            // 만약 유저가 로그인을 하지 않았다면
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('로그인을 해주세요.'); location.href='/login';</script>");
            out.flush();
            return null;

        } else {
            // 만약 유저가 로그인 하였다면
            if (a > 0) {
                // 만약 유저가 최초 데이터를 작성했다면
                if (trainerPromotionLiveAddPeople == trainerPromotionRecruitPeople) {
                    // 만약 현재 프로모션이 현재인원이 가득 차있다면
                    response.setContentType("text/html; charset=UTF-8");
                    PrintWriter out = response.getWriter();
                    out.println("<script>alert('현재 매칭인원이 꽉 차있습니다.'); location.href='/promotionList';</script>");
                    out.flush();
                    return null;
                } else {
                    // 만약 현재 프로모션이 현재인원이 가득 차있지 않다면
                    return "redirect:/";
                }
            } else {
                // 만약 유저가 최초데이터를 작성 하지 않았다면
                response.setContentType("text/html; charset=UTF-8");
                PrintWriter out = response.getWriter();
                out.println("<script>alert('정보를 확인해 주세요.'); location.href='/';</script>");
                out.flush();
                return null;
            }
        }

    }

    @GetMapping("/adjustmentAccountInsert")
    public String adjustmentAccountInsert() {
        return "manage_layout/trainer/adjustment/adjustment_account_insert";
    }

    @GetMapping("/adjustmentAccountModify")
    public String adjustmentAccountModify() {
        return "manage_layout/trainer/adjustment/adjustment_account_modify";
    }

    @GetMapping("/adjustmentAccount")
    public String adjustmentAccount() {
        return "manage_layout/trainer/adjustment/adjustment_account";
    }

}
