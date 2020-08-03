package com.xc.justforjoy.springbootthymeleaf.entity;

import lombok.Data;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Data
public class User {

    String name;

    int age;

    User friend;// 对象类型属性

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public User(){}

}
