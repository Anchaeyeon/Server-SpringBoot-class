package kr.hs.study.GetParameter2.controller;

import kr.hs.study.GetParameter2.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    @PostMapping("/test1")
//    public String test1(@RequestParam("userId") String userId,
//                        @RequestParam("userPass") String userPass) {
//        System.out.println("userId: " + userId);
//        System.out.println("userPass: " + userPass);
//        return "result";
//    }

    @PostMapping("/test1")
    public String test1(@ModelAttribute LoginDTO dto) {
        System.out.println("userId: " + dto.getUserId());
        System.out.println("userPass: " + dto.getUserPass());
        return "result";
    }
}
