package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.dto.CommentDTO;

import java.util.List;

public interface CommentService {
    public void insert(CommentDTO dto);
    public List<CommentDTO> select(int boardId);
}
