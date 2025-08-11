package kr.hs.study.FirstJPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.aot.generate.GeneratedTypeReference;

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
}
