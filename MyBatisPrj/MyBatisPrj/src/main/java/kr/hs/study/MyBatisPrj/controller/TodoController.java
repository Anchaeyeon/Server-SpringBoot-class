package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import kr.hs.study.MyBatisPrj.dto.TodoDTO;
import kr.hs.study.MyBatisPrj.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("/Todo")
    public String goMemo(Model model) {
        List<TodoDTO> allTodo = service.selectAll();
        model.addAttribute("todoall", allTodo);
        return "todo";
    }

    @PostMapping("/todo_done")
    public String insertTodo(TodoDTO dto) {
        service.insert(dto);
        return "redirect:/Todo";
    }

    @GetMapping("/update/{id}")
    public String update_form(@PathVariable("id") int id, Model model) {
        TodoDTO dto = service.selectOne(id);
        model.addAttribute("updateOne", dto);
        return "todo_update";
    }
}
