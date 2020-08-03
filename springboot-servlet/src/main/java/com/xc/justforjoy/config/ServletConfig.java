package com.xc.justforjoy.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author lxcecho
 * @since 2020/8/3
 * <p>
 * 编写一个**EmbeddedServletContainerCustomizer**：
 * 嵌入式的Servlet容器的定制器；来修改Servlet容器的配置
 */
@Configuration
public class ServletConfig {
    /*@Bean  //一定要将这个定制器加入到容器中
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){
        return new EmbeddedServletContainerCustomizer() {

            //定制嵌入式的Servlet容器相关的规则
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                container.setPort(8083);
            }
        };
    }*/

    //注册三大组件 Servlet、Filter、Listener

    //ServletRegistrationBean
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        /*ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return registrationBean;*/
        return null;
    }

    //FilterRegistrationBean
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        /*FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
        return registrationBean;*/
        return null;
    }

    //ServletListenerRegistrationBean
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        /*ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        return registrationBean;*/
        return null;
    }

}
