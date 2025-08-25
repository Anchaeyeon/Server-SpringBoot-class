package kr.hs.study.SigninJpa.service;

import kr.hs.study.SigninJpa.dto.MemberDTO;
import kr.hs.study.SigninJpa.entity.MemberEntity;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    public void save(MemberDTO member);
    List<MemberDTO> findAll();

    MemberDTO login(MemberDTO dto);
    // MemberDTO findById(Long id);
    MemberDTO findBymemberEmail(String memberEmail);
}
