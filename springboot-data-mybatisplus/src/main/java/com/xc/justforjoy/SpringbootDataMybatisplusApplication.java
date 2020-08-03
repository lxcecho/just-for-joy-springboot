package com.xc.justforjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xc.justforjoy.mapper")
public class SpringbootDataMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataMybatisplusApplication.class, args);
    }

}