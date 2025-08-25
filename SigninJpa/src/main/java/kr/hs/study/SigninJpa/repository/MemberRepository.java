package kr.hs.study.SigninJpa.repository;

import kr.hs.study.SigninJpa.dto.MemberDTO;
import kr.hs.study.SigninJpa.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    Optional<MemberEntity> findBymemberEmail(String memberEmail);
}
