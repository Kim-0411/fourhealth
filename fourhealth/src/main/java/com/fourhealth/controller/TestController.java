package com.fourhealth.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    
    @GetMapping("/faceBookTest")
    public String FaceBookTest(Model model){
        model.addAttribute("title", "Facebook test");

        return "facebook_test";
    }

}
