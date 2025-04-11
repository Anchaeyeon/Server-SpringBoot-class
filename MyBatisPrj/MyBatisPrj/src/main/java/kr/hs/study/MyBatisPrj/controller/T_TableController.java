package kr.hs.study.MyBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class T_TableController {
    @GetMapping("/t_table")
    public String ttable() {
        return "table_input";
    }

    @PostMapping("table_input")
    public String t_table(Model model, @RequestParam("gugudan") int gugudan) {
        String result = "";

        for (int i=1; i<=9; i++) {
            result += gugudan + " * " + i + " = " + gugudan*i;
            System.out.println(gugudan + " * " + i + " = " + gugudan*i);
        }

        model.addAttribute("gugudanData", result);

        return "gugudanResult";
    }
}
