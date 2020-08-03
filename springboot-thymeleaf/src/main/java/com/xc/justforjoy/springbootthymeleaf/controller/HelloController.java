package com.xc.justforjoy.springbootthymeleaf.controller;

import com.xc.justforjoy.springbootthymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello,Thymeleaf!");
        return "hello";
    }

    @GetMapping("show")
    public String show(Model model){
        User user = new User();
        user.setAge(23);
        user.setName("Jerry Li");
        user.setFriend(new User("Tom",24));
        model.addAttribute("user",user);
        return "show";
    }

    @GetMapping("show2")
    public String show2(Model model){
        model.addAttribute("today",new Date());
        return "show2";
    }

}
