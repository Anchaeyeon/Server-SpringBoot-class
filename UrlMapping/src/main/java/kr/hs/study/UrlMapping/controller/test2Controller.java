package kr.hs.study.UrlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub1")
public class test2Controller {
    @RequestMapping(value="/test3", method = RequestMethod.GET)
    public String test3() {
        return "/sub1/test3";
    }
    @RequestMapping(value="/test4", method = RequestMethod.GET)
    public String test4() {
        return "/sub1/test4";
    }
    @RequestMapping(value="/test5", method = RequestMethod.GET)
    public String test5() {
        return "/sub1/test5";
    }
}
