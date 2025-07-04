package kr.hs.study.boardMybatis.dao;

import kr.hs.study.boardMybatis.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {
    public void insert(BoardDTO dto);
    public List<BoardDTO> selectAll();
    public BoardDTO selectOne(int id);
    public void update(BoardDTO dto);
    public void delete(int id);
    public void updateHits(int id);
}
