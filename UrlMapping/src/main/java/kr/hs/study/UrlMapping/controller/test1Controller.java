package kr.hs.study.UrlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class test1Controller {
    @RequestMapping(value="/test1", method = RequestMethod.GET)
    public String test1() {
        return "test1";
    }
    @RequestMapping(value="/test2", method = RequestMethod.GET)
    public String test2() {
        return "test2";
    }

//    @RequestMapping(value="/sub1/test3", method = RequestMethod.GET)
//    public String test3() {
//        return "test3";
//    }
//    @RequestMapping(value="/sub1/test4", method = RequestMethod.GET)
//    public String test4() {
//        return "test4";
//    }
//    @RequestMapping(value="/sub1/test5", method = RequestMethod.GET)
//    public String test5() {
//        return "test5";
//    }

    //test를 post 방식으로 요청했을 때, test6.html을 실행해라
    @PostMapping("/test6")
    public String test6() {
        return "test6";
    }
}