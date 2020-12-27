package com.fourhealth.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fourhealth.dto.MemberDTO;
import com.fourhealth.service.MemberService;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/login")
    public String test(Model model) {
        model.addAttribute("test", "Hello thymeleaf");
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam(name = "id", required = false) String userId,
            @RequestParam(name = "pw", required = false) String userPw, HttpSession session, RedirectAttributes rattr) {

        System.out.println("로그인에서 받은 id------" + userId);
        System.out.println("로그인에서 받은 pw------" + userPw);

        MemberDTO memberdto = memberService.getMember(userId);
        String result = memberdto.getMemberLevel();
        String userLeverl = result.substring(result.length() - 3, result.length());

        String userLeverl2 = null;

        if (userId != null && userPw != null && memberdto != null && memberdto.getMemberPw() != null
                && userPw.equals(memberdto.getMemberPw())) {
            if (userLeverl.equals("001")) {
                userLeverl2 = "관리자";
            } else if (userLeverl.equals("002")) {
                userLeverl2 = "트레이너";
            } else {
                userLeverl2 = "사용자";
            }
            session.setAttribute("USERID", userId);
            session.setAttribute("USERLEVEL", userLeverl2);
            session.setAttribute("USERNIKNAME", memberdto.getMemberNickname());
            System.out.println("로그인 성공");
        } else {
            rattr.addAttribute("result", "입력하신 정보는 없습니다.");
            System.out.println("로그인 실패");
        }

        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate();

        return "redirect:/login";
    }
}
