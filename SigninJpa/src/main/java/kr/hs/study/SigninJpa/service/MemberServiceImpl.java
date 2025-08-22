package kr.hs.study.SigninJpa.service;

import kr.hs.study.SigninJpa.dto.MemberDTO;
import kr.hs.study.SigninJpa.entity.MemberEntity;
import kr.hs.study.SigninJpa.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberRepository repo;


    @Override
    public void save(MemberDTO member) {
        repo.save(MemberDTO.toEntity(member));
    }

    @Override
    public List<MemberDTO> findAll() {
        // 엔터티를 받아와서
        List<MemberEntity> e = repo.findAll();

        // 디티오 변수를 만들기 (어레이리스트)
        List<MemberDTO> dto = new ArrayList<>();

        // 하나씩 엔티티를 디티오로 변환 (포문)
        for (MemberEntity member : e) {
            dto.add(MemberEntity.toDTO(member));
        }

        // 리턴
        return dto;
    }
}
