package com.zx.agvserver.security.secruity;

import java.io.Serializable;

/**
 * Created by zx on 2017/6/9.
 */
public class JwtAuthenticationResponse implements Serializable {
    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
