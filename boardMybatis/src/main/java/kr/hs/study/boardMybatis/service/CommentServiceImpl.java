package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.dao.CommentDAO;
import kr.hs.study.boardMybatis.dto.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentDAO dao;

    @Override
    public void insert(CommentDTO dto) {
        dao.insert(dto);
    }

    @Override
    public List<CommentDTO> select(int boardId) {
        return dao.select(boardId);
    }
}
