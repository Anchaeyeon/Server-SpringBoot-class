package kr.hs.study.MyBatisPrj.dto;

import lombok.Data;

@Data
public class ScoreDTO {
    private String name;
    private int korean;
    private int english;
    private int math;
    private int total;
    private double avg;
}
