package kr.hs.study.boardMybatis.controller;

import kr.hs.study.boardMybatis.dto.BoardDTO;
import kr.hs.study.boardMybatis.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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
        return "redirect:/";
    }

    @GetMapping("/board")
    public String showBoard(Model model) {
        List<BoardDTO> allBoard = service.selectAll();
        model.addAttribute("boardall", allBoard);
        return "showBoard";
    }

    @GetMapping("/board/showone/{id}")
    public String showOne(@PathVariable("id") int id, Model model) {
        BoardDTO oneBoard = service.selectOne(id);
        model.addAttribute("boardone", oneBoard);
        return "showOneBoard";
    }
}
