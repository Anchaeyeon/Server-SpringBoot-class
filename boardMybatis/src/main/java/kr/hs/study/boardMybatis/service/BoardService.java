package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    public void insert(BoardDTO dto);
    public List<BoardDTO> selectAll();
}
