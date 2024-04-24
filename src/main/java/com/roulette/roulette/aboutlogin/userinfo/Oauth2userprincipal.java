package com.roulette.roulette.aboutlogin.userinfo;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Oauth2userprincipal implements OAuth2User, UserDetails {
    private final Oauth2UserInfo oauth2UserInfo;

    private List<SimpleGrantedAuthority> authlist=new ArrayList<>();

    public Oauth2userprincipal(Oauth2UserInfo oauth2UserInfo) {
        this.oauth2UserInfo = oauth2UserInfo;
    }


    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return oauth2UserInfo.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Map<String, Object> getAttributes() {

        return oauth2UserInfo.getAttributes();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (authlist.size()==0){
            authlist.add(new SimpleGrantedAuthority("ROLE_user"));
        }
        return authlist;
    }

    @Override
    public String getName() {
        return oauth2UserInfo.getName();
    }
}
