package com.xc.justforjoy.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author lxcecho
 * @since 2020/8/3
 *
 * WebInit 的作用类似于web.xml文件，这个类需要实现WebApplicationInitializer接口，并实现接口中的方法，
 * 当项目启动时，onStartup()方法会被自动执行，我们可以在这个方法中做一些项目初始化操作，例如加载SpringMVC容器，
 * 添加过滤器，添加Listener，添加Servlet等。
 */
public class WebInit implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        //首先来加载 SpringMVC 的配置文件
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCConfig.class);
        // 添加 DispatcherServlet
        ServletRegistration.Dynamic springmvc = servletContext.addServlet("springmvc", new DispatcherServlet(ctx));
        // 给 DispatcherServlet 添加路径映射
        springmvc.addMapping("/");
        // 给 DispatcherServlet 添加启动时机
        springmvc.setLoadOnStartup(1);
    }
}
