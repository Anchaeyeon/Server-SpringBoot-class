package kr.hs.study.SigninJpa.controller;

import kr.hs.study.SigninJpa.dto.MemberDTO;
import kr.hs.study.SigninJpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberService service;

    @GetMapping("/")
    public String input() {
        return "index";
    }

    @GetMapping("/signin")
    public String signin() {
        return "signin";
    }

    @PostMapping("/signin_done")
    public String signin_done(MemberDTO dto) {
        service.save(dto);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
