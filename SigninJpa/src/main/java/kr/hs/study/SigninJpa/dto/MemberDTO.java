package kr.hs.study.SigninJpa.dto;

import kr.hs.study.SigninJpa.entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    //private LocalDateTime date;

    public static MemberEntity toEntity(MemberDTO dto) {
        return MemberEntity.builder()
                .id(dto.getId())
                .memberEmail(dto.getMemberEmail())
                .memberPassword(dto.getMemberPassword())
                .memberName(dto.getMemberName())
                .build();
    }
}
