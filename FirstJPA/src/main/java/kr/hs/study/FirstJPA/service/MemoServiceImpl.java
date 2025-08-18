package kr.hs.study.FirstJPA.service;

import kr.hs.study.FirstJPA.dto.MemoDTO;
import kr.hs.study.FirstJPA.entity.MemoEntity;
import kr.hs.study.FirstJPA.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    private MemoRepository repo;

    @Override
    public void save(MemoDTO dto) {
        // dto -> entity로 변환
        MemoEntity me = MemoDTO.toEntity(dto);
        repo.save(me);
    }
}
