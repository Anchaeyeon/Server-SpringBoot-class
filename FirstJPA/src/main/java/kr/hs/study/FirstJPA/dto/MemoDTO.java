package kr.hs.study.FirstJPA.dto;

import kr.hs.study.FirstJPA.entity.MemoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemoDTO {
    private Long id;
    private String title;
    private String content;

    // dto를 entity로 변환
    public static MemoEntity toEntity(MemoDTO dto) {
        return MemoEntity.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();
    }
}
