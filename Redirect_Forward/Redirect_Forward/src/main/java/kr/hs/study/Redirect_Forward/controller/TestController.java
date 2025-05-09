package kr.hs.study.Redirect_Forward.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    //forward
    @GetMapping("/forward")
    public String forward() {
        return "forward:/sub1";
        //sub1의 주소로 이동해라
    }

    @GetMapping("/sub1")
    public String sub1() {
        return "sub1";
        //sub1: html 파일
    }

    //redirect
    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:/sub1";
    }
}
