package kr.hs.study.boardMybatis.controller;

import kr.hs.study.boardMybatis.dto.BoardDTO;
import kr.hs.study.boardMybatis.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @Autowired
    private BoardService service;

    @GetMapping("/")
    public String goIndex() {
        return "index";
    }

    @GetMapping("/board/save")
    public String goWritingBoard() {
        return "writingBoard";
    }

    @PostMapping("/board/save")
    public String saveWritingBoard(BoardDTO dto) {
        service.insert(dto);
        return "result";
    }
}
