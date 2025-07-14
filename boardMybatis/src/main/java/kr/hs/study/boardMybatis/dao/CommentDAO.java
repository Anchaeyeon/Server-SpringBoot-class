package kr.hs.study.boardMybatis.dao;

import kr.hs.study.boardMybatis.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentDAO {
    public void insert(CommentDTO dto);
}
