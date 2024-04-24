package com.roulette.roulette.aboutlogin.userinfo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.pl.REGON;

@RequiredArgsConstructor
@Getter
public enum OAuth2Provider {
    Google("google"),
    Kakao("kakao");

    private final String registrationid;
}
