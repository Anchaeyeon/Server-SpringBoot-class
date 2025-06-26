package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.dao.BoardDAO;
import kr.hs.study.boardMybatis.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    private BoardDAO dao;

    @Override
    public void insert(BoardDTO dto) {
        dao.insert(dto);
    }
}
