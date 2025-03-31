package kr.hs.study.GetParameter.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req) {
        String str1 = req.getParameter("data1");
        String str2 = req.getParameter("data2");
        String str3[] = req.getParameterValues("data3");
        System.out.println("data1 : " + str1);
        System.out.println("data2 : " + str2);
        for(String a:str3) {
            System.out.println("data3 : " + a);
        }
        return "result";
    }

    public String test1(WebRequest req) {
        String str1 = req.getParameter("data1");
        String str2 = req.getParameter("data2");
        System.out.println("data1 : "+str1);
        System.out.println("data2 : "+str2);
        return "result";
    }
}
