package kr.hs.study.Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @PostMapping("/index")
    public String test1(@RequestParam("num1") int num1,
                        @RequestParam("num2") int num2,
                        @RequestParam("num3") int num3,
                        @RequestParam("num4") int num4,
                        @RequestParam("num5") int num5) {

        int number[] = {num1, num2, num3, num4, num5};
        int evenSum = 0;
        int oddSum = 0;

        for (int i=0; i<5; i++) {
            if (number[i]%2==0)
                evenSum += number[i];
            else
                oddSum += number[i];
        }
        System.out.println("짝수합 : " + evenSum);
        System.out.println("홀수합 : " + oddSum);

        return "result";

    }
}
