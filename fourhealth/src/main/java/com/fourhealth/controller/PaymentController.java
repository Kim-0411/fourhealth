package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/adjustmentAccountInsert")
    public String adjustmentAccountInsert() {
        return "trainer_layout/adjustment/adjustment_account_insert";
    }

    @GetMapping("/adjustmentAccountModify")
    public String adjustmentAccountModify() {
        return "trainer_layout/adjustment/adjustment_account_modify";
    }

    @GetMapping("/adjustmentAccount")
    public String adjustmentAccount() {
        return "trainer_layout/adjustment/adjustment_account";
    }

}
