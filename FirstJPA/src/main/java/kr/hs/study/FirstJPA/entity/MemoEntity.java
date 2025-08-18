package kr.hs.study.FirstJPA.entity;

import jakarta.persistence.*;
import kr.hs.study.FirstJPA.dto.MemoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.aot.generate.GeneratedTypeReference;

@Data
@Entity
@Builder
@NoArgsConstructor //매개변수 없는 기본 생성자
@AllArgsConstructor // 여러 생성자
@Table(name="memoJPA") // 테이블 생성
public class MemoEntity {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가
    private Long id;

    @Column(length = 20, unique = true)
    private String title;

    @Column
    private String content;

    //entity -> dto로 변환
    public static MemoDTO toDTO(MemoEntity e) {
        return MemoDTO.builder()
                .id(e.getId())
                .title(e.getTitle())
                .content(e.getContent())
                .build();
    }
}
