package kr.hs.study.MyBatisPrj.service;

import kr.hs.study.MyBatisPrj.dao.MemoDAO;
import kr.hs.study.MyBatisPrj.dao.TodoDAO;
import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import kr.hs.study.MyBatisPrj.dto.TodoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoDAO dao;

    @Override
    public void insert(TodoDTO dto) {
        dao.insert(dto);
    }

    @Override
    public void update(TodoDTO dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public List<TodoDTO> selectAll() {
        return dao.selectAll();
    }

    @Override
    public TodoDTO selectOne(int id) {
        return dao.selectOne(id);
    }
}
