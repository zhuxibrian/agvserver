package com.zx.agvserver.security.secruity;

import com.zx.agvserver.domain.User;

/**
 * Created by zx on 2017/6/7.
 */
public final class JwtUserFactory {
    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getPersonname(),
                user.getPhone(),
                user.getEmail(),
                user.getRoles()
        );
    }

//    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> authorities) {
//        return authorities.stream()
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//    }
}
