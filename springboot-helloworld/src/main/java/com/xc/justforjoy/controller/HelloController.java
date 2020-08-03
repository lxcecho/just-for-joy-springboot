package com.xc.justforjoy.controller;

import com.xc.justforjoy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
//@RestController 等价于 下方的 @Controller+@ResponseBody 组合，使得controller里面的方法都以json格式输出，不用再写jackjson的配置！
@Controller
@ResponseBody // @ResponseBody 放在类前面，这个类的所有方法的数据直接写给浏览器，（如果是对象转为json数据）
public class HelloController {

    /**
     * REST API 的方式访问
     * http://localhost:8080/hello
     */
    @RequestMapping("/hello")
    public String hello() {
        return "hello,world";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setName("lxcecho");
        user.setPassword("123456");
        return user;
    }

}