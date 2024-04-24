package com.roulette.roulette.aboutlogin.jwt;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JwtToken {
    private String accesstoken;
    private String refreshtoken;
    private String grantType;

}
