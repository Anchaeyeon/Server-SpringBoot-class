package kr.hs.study.FirstJPA.repository;

import kr.hs.study.FirstJPA.dto.MemoDTO;
import kr.hs.study.FirstJPA.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
