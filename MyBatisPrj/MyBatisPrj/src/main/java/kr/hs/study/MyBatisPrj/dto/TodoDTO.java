package kr.hs.study.MyBatisPrj.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TodoDTO {
    private int id;
    private String todo;
    private String pw;
    private LocalDateTime post_todo;
}
