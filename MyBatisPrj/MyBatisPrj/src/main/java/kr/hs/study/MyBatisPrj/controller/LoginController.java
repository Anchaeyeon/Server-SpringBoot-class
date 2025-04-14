package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLogin() {
        return "login_input";
    }

    @PostMapping("login_input")
    public String postLogin(@ModelAttribute LoginDTO dto, Model model) {
        String test_id = "kim";
        String test_pw = "1111";

        if (dto.getId().equals(test_id) && dto.getPw().equals(test_pw)) {
            model.addAttribute("login", "로그인 성공");
        }
        else {
            model.addAttribute("login", "로그인 실패");
        }

        return "login_result";
    }
}
