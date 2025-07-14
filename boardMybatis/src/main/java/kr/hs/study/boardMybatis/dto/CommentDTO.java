package kr.hs.study.boardMybatis.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDTO {
    private int id;
    private String commentWriter;
    private String commentContents;
    private int boardId;
    private LocalDateTime commentCreatedTime;
}
