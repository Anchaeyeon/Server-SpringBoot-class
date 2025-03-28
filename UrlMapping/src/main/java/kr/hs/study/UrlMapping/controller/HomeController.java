package kr.hs.study.UrlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
}
