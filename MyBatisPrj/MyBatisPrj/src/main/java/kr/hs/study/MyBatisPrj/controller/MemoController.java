package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import kr.hs.study.MyBatisPrj.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("/Memo")
    public String getMemo() {
        return "memo";
    }

    @GetMapping("/memo/list")
    public String listAll(Model model) {
        List<MemoDTO> all = service.listAll();
        model.addAttribute("data", all);
        System.out.println("size: " + all.size());
        return "memo_list";
    }
}
