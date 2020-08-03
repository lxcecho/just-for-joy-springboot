package com.xc.justforjoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@RestController
public class HelloController {

//    @Value("${person.name}")
//    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
//        return "Hello"+name;
        return "hello";
    }
}
