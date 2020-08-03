package com.xc.justforjoy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author lxcecho
 * @since 2020/8/3
 *
 * @Configuration : 表示这是一个配置类，在这里，这个配置的作用类似于 applicationContext.xml 文件。
 * @ComponentScan : 表示配置包扫描，里边的属性和XML配置中的属性都是一一对应的，useDefaultFilters表示使用默认的过滤器，
 * 然后又除去Controller注解，即在Spring容器中扫描了Controller之外的其他所有bean。
 */
@Configuration
@ComponentScan(basePackages = "com.xc.ssm.config", useDefaultFilters = true, excludeFilters =
        {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)})
public class SpringConfig {
}
