package com.xc.justforjoy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * @author lxcecho
 * @since 2020/8/3
 *
 * @SpringBootApplication 来标注一个主程序类，说明这是一个SpringBoot程序
 */
@SpringBootApplication
public class SpringbootExerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootExerApplication.class, args);
    }

    /*public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("Let's inspect the beans provided by springboot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName : beanNames){
                System.out.println(beanName);
            }
        };
    }*/

}
