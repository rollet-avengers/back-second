package com.roulette.roulette.aboutlogin.userinfo;

import java.util.Map;

public interface Oauth2UserInfo {
    OAuth2Provider getProvider();

    String getAccessToken();

    Map<String, Object> getAttributes();

    String getId();

    String getEmail();

    String getName();

    String getFirstName();

    String getLastName();

    String getNickname();

    String getProfileImageUrl();
}
