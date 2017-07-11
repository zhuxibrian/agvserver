package com.zx.agvserver.dao;

import com.zx.agvserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zx on 2017/6/8.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(final String username);
}
