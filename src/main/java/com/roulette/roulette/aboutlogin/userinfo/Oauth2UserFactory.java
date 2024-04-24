package com.roulette.roulette.aboutlogin.userinfo;

import java.util.Map;

public class Oauth2UserFactory {
    public static Oauth2UserInfo getOAuth2UserInfo(String registrationId,
                                                   String accessToken,
                                                   Map<String, Object> attributes) {
        if (OAuth2Provider.Google.getRegistrationid().equals(registrationId)) {

            return new GoogleUserinfo(accessToken, attributes);

        } else if (OAuth2Provider.Kakao.getRegistrationid().equals(registrationId)) {
            return new KakaoUserInfo(accessToken, attributes);
        }
        else{
            return null;
        }
    }
}
