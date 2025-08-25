package kr.hs.study.SigninJpa.controller;

import jakarta.servlet.http.HttpSession;
import kr.hs.study.SigninJpa.dto.MemberDTO;
import kr.hs.study.SigninJpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @GetMapping("/signin_list")
    public String signin_list(Model model) {
        List<MemberDTO> list = service.findAll();
        model.addAttribute("member", list);
        return "signin_list";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login_done")
    public String login_done(MemberDTO dto, HttpSession session) {
        MemberDTO re = service.login(dto);
        return "login_result";
    }
}
