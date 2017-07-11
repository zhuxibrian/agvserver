package com.zx.agvserver.security.auth;

import com.zx.agvserver.domain.User;

/**
 * Created by zx on 2017/6/7.
 */
public interface AuthService {
    User register(User userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
