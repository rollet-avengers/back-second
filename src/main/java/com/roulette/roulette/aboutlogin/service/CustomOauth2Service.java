package com.roulette.roulette.aboutlogin.service;

import com.roulette.roulette.aboutlogin.userinfo.Oauth2UserFactory;
import com.roulette.roulette.aboutlogin.userinfo.Oauth2UserInfo;
import com.roulette.roulette.aboutlogin.userinfo.Oauth2userprincipal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomOauth2Service extends DefaultOAuth2UserService {
    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

        OAuth2User oAuth2User=super.loadUser(userRequest);

        return processoauth(userRequest,oAuth2User);
    }

    public OAuth2User processoauth(OAuth2UserRequest userRequest,OAuth2User oAuth2User){

        String registid=userRequest.getClientRegistration().getRegistrationId();

        Oauth2UserInfo oauth2UserInfo= Oauth2UserFactory.getOAuth2UserInfo(registid,userRequest.getAccessToken().getTokenValue(),oAuth2User.getAttributes());


        return new Oauth2userprincipal(oauth2UserInfo);
    }
}
