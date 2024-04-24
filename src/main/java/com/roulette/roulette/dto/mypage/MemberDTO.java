package com.roulette.roulette.dto.mypage;

import lombok.*;

@Data
public class MemberDTO {
    private  String name;
    private  String email;

    public MemberDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public MemberDTO() {

    }
}
