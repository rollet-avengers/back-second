package com.roulette.roulette.aboutlogin.jwt;

import org.springframework.data.annotation.Id;

public class RefreshToken {
    @Id
    private String accesstoken;

    private String refreshtoken;

}
