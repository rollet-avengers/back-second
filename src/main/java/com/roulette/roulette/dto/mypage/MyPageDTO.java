package com.roulette.roulette.dto.mypage;

import lombok.Data;

import java.util.List;

@Data
public class MyPageDTO {
    private String email;
    private List<PostDTO> postList;
}
