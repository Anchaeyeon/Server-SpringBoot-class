package kr.hs.study.FirstJPA.service;

import kr.hs.study.FirstJPA.dto.MemoDTO;
import kr.hs.study.FirstJPA.entity.MemoEntity;

public interface MemoService {
    public void save(MemoDTO memo);
}
