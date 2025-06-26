package kr.hs.study.boardMybatis.dao;

import kr.hs.study.boardMybatis.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDAO {
    public void insert(BoardDTO dto);
}
