package kr.hs.study.LoginTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/login")
    public String GetLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String PostLogin(@RequestParam("email") String email,
                        @RequestParam("pw") int pw) {

        if (email.equals("lay") && pw==1111) {
            System.out.println("login!!");
            return "result1";
        }
        else {
            System.out.println("not login");
            return "result2";
        }
    }
}
