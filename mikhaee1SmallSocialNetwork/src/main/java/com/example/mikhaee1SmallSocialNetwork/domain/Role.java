package com.example.mikhaee1SmallSocialNetwork.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author mikhaee1
 */

public enum Role implements GrantedAuthority {
    USER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}