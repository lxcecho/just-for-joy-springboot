package com.xc.justforjoy.repository;

import com.xc.justforjoy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lxcecho
 * @since 2020/8/3
 * <p>
 * 继承JpaRepository来完成对数据库的操作
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
