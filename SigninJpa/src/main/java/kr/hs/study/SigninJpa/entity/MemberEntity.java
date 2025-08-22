package kr.hs.study.SigninJpa.entity;

import jakarta.persistence.*;
import kr.hs.study.SigninJpa.dto.MemberDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor //매개변수 없는 기본 생성자
@AllArgsConstructor // 여러 생성자
@Table(name="SignupJPA") // 테이블 생성
public class MemberEntity {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가
    private Long id;

    @Column(length = 100, unique = true)
    private String memberEmail;

    @Column(length = 100, unique = true)
    private String memberPassword;

    @Column(length = 100)
    private String memberName;

    //entity -> dto로 변환
    public static MemberDTO toDTO(MemberEntity e) {
        return MemberDTO.builder()
                .id(e.getId())
                .memberEmail(e.getMemberEmail())
                .memberPassword(e.getMemberPassword())
                .memberName(e.getMemberName())
                .build();
    }
}
