package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.dao.BoardDAO;
import kr.hs.study.boardMybatis.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    private BoardDAO dao;

    @Override
    public void insert(BoardDTO dto) {
        dao.insert(dto);
    }

    @Override
    public List<BoardDTO> selectAll() {
        return dao.selectAll();
    }

    @Override
    public BoardDTO selectOne(int id) {
        return dao.selectOne(id);
    }

    @Override
    public void update(BoardDTO dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public void updateHits(int id) {
        dao.updateHits(id);
    }
}
