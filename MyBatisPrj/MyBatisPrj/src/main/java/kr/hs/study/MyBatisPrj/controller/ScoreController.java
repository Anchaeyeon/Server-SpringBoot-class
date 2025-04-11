package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.ScoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {    
    public int avg;
    public int total;

    @GetMapping("/score")
    public String getScore() {
        return "score_input";
    }

    @PostMapping("score_input")
    public String postScore(@ModelAttribute ScoreDTO dto, Model model) {
        dto.setTotal(dto.getKorean()+dto.getEnglish()+dto.getMath());
        dto.setAvg(dto.getTotal()/3.0);

        System.out.println("이름: " + dto.getName());
        System.out.println("국어: " + dto.getKorean());
        System.out.println("영어: " + dto.getEnglish());
        System.out.println("수학: " + dto.getMath());
        System.out.println("총점: " + dto.getTotal());
        System.out.println("평균: " + dto.getAvg());

        model.addAttribute("scoreData", dto);
        return "scoreResult";
    }
}
