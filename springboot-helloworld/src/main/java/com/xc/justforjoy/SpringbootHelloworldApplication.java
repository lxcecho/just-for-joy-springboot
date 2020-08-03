package com.xc.justforjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lxcecho
 * @since 2020/8/3
 * <p>
 * 一个功能：浏览器发送hello请求，服务器接收请求并处理，响应hello world字符串。
 */

// @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot 应用。
// SpringBoot就应该运行这个类的main方法来启动SpringBoot应用。

@SpringBootApplication
public class SpringbootHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldApplication.class, args);
    }

}
