package com.xc.justforjoy.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter Process...");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }

}
