package com.zx.agvserver.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

/**
 * Created by zx on 2017/6/5.
 */
@Entity
@Table(name="USERS")
@Data
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Integer id;

    @NotBlank
    @Column(unique = true)
    private String username;

    @NotBlank
    private String password;

    private String personname;
    private String phone;
    private String email;
    private Boolean isNonLock = true;
    private Boolean isUseful = true;

    @ManyToMany(cascade = CascadeType.ALL, targetEntity = Role.class)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    )
    private List<Role> roles;
}
