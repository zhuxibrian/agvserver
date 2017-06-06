package com.zx.agvserver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zx on 2017/6/5.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
}
