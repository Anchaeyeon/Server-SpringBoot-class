package kr.hs.study.FirstJPA.controller;

import kr.hs.study.FirstJPA.dto.MemoDTO;
import kr.hs.study.FirstJPA.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("/input")
    public String input() {
        return "inputForm";
    }

    @PostMapping("/input_done")
    public void input_done(MemoDTO dto) {
        service.save(dto);
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<MemoDTO> list = service.findAll();
        model.addAttribute("data", list);
        return "list";
    }
}
