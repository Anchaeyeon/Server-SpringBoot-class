package kr.hs.study.LoginTest.controller;

import ch.qos.logback.core.model.Model;
import kr.hs.study.LoginTest.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDTO dto){
        if (dto.getEmail().equals("lay") && dto.getPw()==1111) {
            System.out.println("Login!!");
            return "result1";
        }
        else {
            System.out.println("not Login");
            return "result2";
        }
    }
}
