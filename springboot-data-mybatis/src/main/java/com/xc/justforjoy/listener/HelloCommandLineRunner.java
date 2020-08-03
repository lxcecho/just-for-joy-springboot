package com.xc.justforjoy.listener;

import org.springframework.boot.CommandLineRunner;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
public class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("CommandLineRunner ... run ...");
    }
}
