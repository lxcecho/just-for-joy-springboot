package com.xc.justforjoy.controller;

import com.xc.justforjoy.entity.User;
import com.xc.justforjoy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@RestController
public class UserControl {

    @Autowired
    private UserRepository userRepository;

/*
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.findById(id);
        return user;
    }
*/

    @GetMapping("/user")
    public User insertUser(User user) {
        User save = userRepository.save(user);
        return save;
    }

}
