package com.xc.justforjoy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author lxcecho
 * @since 2020/8/3
 * <p>
 * 必须编写一个**SpringBootServletInitializer**的子类，并调用configure方法
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        //传入SpringBoot应用的主程序
        return application.sources(SpringbootWebJspApplication.class);
    }

}
