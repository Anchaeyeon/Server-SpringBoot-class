package kr.hs.study.LoginTest.dto;

import lombok.Data;

@Data  // set,get,constructor 다 들어있음
public class LoginDTO {
    private String email;
    private Integer pw;
}
