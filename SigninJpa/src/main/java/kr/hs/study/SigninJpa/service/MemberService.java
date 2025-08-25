package kr.hs.study.SigninJpa.service;

import kr.hs.study.SigninJpa.dto.MemberDTO;
import kr.hs.study.SigninJpa.entity.MemberEntity;

import java.util.List;

public interface MemberService {
    public void save(MemberDTO member);
    List<MemberDTO> findAll();

    MemberDTO login(MemberDTO dto);
}
