package kr.hs.study.MyBatisPrj.dao;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import kr.hs.study.MyBatisPrj.dto.TodoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoDAO {
    public void insert(TodoDTO dto);
    public void update(TodoDTO dto);
    public void delete();
    public List<TodoDTO> selectAll();
    public TodoDTO selectOne(int id);
}
