package com.zx.agvserver.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zx on 2017/6/7.
 */
@Entity
@Table(name = "ROLE")
@Data
public class Role {
    @Id
    @Column(name="role_id")
    private Integer id;

    private String role;
}
