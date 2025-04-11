package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.ScoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ScoreController {    
    public int avg;
    public int total;

    @GetMapping("/score")
    public String getScore() {
        return "score_input";
    }

    @PostMapping("score_input")
    public ModelAndView postScore(@ModelAttribute ScoreDTO dto) {
        ModelAndView mav = new ModelAndView("scoreResult");
        List<String> results = new ArrayList<>();

        total = dto.getKorean() + dto.getEnglish() + dto.getMath();
        avg = (dto.getKorean() + dto.getEnglish() + dto.getMath()) / 3;
        
        results.add("이름 : " + dto.getName());
        results.add("국어 : " + dto.getKorean());
        results.add("영어 : " + dto.getEnglish());
        results.add("수학 : " + dto.getMath());
        results.add("총점 : " + total);
        results.add("평균 : " + avg);

        mav.addObject("results", results);
        return mav;
    }
}
