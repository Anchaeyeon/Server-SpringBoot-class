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
    public String updateOne_form(@PathVariable("id") int id, Model model) {
        TodoDTO dto = service.selectOne(id);
        model.addAttribute("updateOne", dto);
        return "todo_update";
    }

    @PostMapping("/update")
    public String update_form(TodoDTO dto) {
        TodoDTO originalData = service.selectOne(dto.getId());

        if (originalData.getPw().equals(dto.getPw())) {
            service.update(dto);
            return "redirect:/Todo";
        }

        return "redirect:/update/"+dto.getId();
    }

    @GetMapping("/deleteTodo/{id}")
    public String delete_form(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/Todo";
    }
}
