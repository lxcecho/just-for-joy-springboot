package com.xc.justforjoy.dao;

import com.xc.justforjoy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName,String email);

}
