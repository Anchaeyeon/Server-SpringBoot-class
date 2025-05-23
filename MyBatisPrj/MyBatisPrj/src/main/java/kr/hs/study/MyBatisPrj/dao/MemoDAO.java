package kr.hs.study.MyBatisPrj.dao;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoDAO {
    // 1. insert
    public void insert(MemoDTO dto);

    // 2. update
    public void update(MemoDTO dto);

    // 3. delete
    public void delete(int idx);

    // 4. select
    public List<MemoDTO> listAll();

    // 값 하나 갖고오기
    public MemoDTO selectOne(int idx);
}
