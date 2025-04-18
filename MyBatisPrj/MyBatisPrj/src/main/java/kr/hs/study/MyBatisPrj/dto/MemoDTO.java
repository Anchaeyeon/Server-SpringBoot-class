package kr.hs.study.MyBatisPrj.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemoDTO {
    private int idx;
    private String writer;
    private String memo;
    private LocalDateTime post_date;
}
