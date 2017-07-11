package com.zx.agvserver.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * Created by zx on 2017/6/7.
 */
@Entity
@Table(name = "ROLE")
@Data
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue
    @Column(name="role_id")
    private Integer id;

    private String Authority;

    @Override
    public String getAuthority() {
        return Authority;
    }

}
