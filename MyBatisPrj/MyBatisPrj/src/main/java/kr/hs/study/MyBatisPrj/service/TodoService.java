package kr.hs.study.MyBatisPrj.service;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import kr.hs.study.MyBatisPrj.dto.TodoDTO;

import java.util.List;

public interface TodoService {
    public void insert(TodoDTO dto);
    public void update(TodoDTO dto);
    public void delete(int id);
    public List<TodoDTO> selectAll();
    public TodoDTO selectOne(int id);
}
