package kr.hs.study.MyBatisPrj.service;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import kr.hs.study.MyBatisPrj.dto.TodoDTO;

import java.util.List;

public interface TodoService {
    public void insert(TodoDTO dto);
    public void update();
    public void delete();
    public List<TodoDTO> selectAll();
    public TodoDTO selectOne();
}
