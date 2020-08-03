package com.xc.justforjoy.config;

import com.xc.justforjoy.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration ：指明当前类是一个配置类，就是替代之前的Spring配置文件。
 * 在配置文件中用<bean/>标签添加组件
 * <p>
 * @author lxcecho
 * @since 2020/8/3
 */
@Configuration
public class MyConfig {
    /**
     * 将方法的返回值添加到容器容器中，容器中这个组件默认的id就是方法名
     *
     * @return
     */
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器中添加组价了。");
        return new HelloService();
    }
}
