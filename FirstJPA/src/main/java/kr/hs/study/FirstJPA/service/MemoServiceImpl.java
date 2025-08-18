package kr.hs.study.FirstJPA.service;

import kr.hs.study.FirstJPA.dto.MemoDTO;
import kr.hs.study.FirstJPA.entity.MemoEntity;
import kr.hs.study.FirstJPA.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<MemoDTO> findAll() {
        List<MemoEntity> mEntity = repo.findAll();
        // 1, kim / 2, lee / 3, park
        List<MemoDTO> dtoList = new ArrayList<>();
        for (MemoEntity txt : mEntity) { //mEntity에 들어있는 값을 txt에 하나씩 넣어라
            MemoDTO m = MemoEntity.toDTO(txt);
            dtoList.add(m);
        }
        return dtoList;
    }
}
