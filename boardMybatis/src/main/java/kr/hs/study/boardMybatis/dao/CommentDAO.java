package kr.hs.study.boardMybatis.dao;

import kr.hs.study.boardMybatis.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDAO {
    public void insert(CommentDTO dto);
    public List<CommentDTO> select(int boardId);
}
