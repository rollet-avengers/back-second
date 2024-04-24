package com.roulette.roulette.aboutlogin.userinfo;

import java.util.Map;

public class KakaoUserInfo implements Oauth2UserInfo{
    private Map<String, Object> attributes;
    private  String accessToken;
    private  String id;
    private  String email;
    private  String name;
    private  String firstName;
    private String lastName;
    private String nickName;
    private String profileImageUrl;


    public KakaoUserInfo(String accessToken, Map<String, Object> attributes) {
        this.accessToken = accessToken;

        Map<String, Object> kakaoAccount = (Map<String, Object>) attributes.get("kakao_account");
        Map<String, Object> kakaoProfile = (Map<String, Object>) kakaoAccount.get("profile");
        this.attributes = kakaoProfile;

        this.id = ((Long) attributes.get("id")).toString();
        this.email = (String) kakaoAccount.get("email");

        this.name = (String) this.attributes.get("nickname");
        this.firstName = null;
        this.lastName = null;
        this.nickName = null;

        this.profileImageUrl = (String) this.attributes.get("profile_image_url");

        this.attributes.put("id", id);
        this.attributes.put("email", this.email);
    }


    @Override
    public OAuth2Provider getProvider() {
        return null;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public String getProfileImageUrl() {
        return null;
    }
}
