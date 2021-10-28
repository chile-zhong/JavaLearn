package com.lxg;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author lxg
 * @description 过滤器注解配置
 * @date 2021/10/24
 */
@WebFilter("/*") //访问所有资源之前,都会执行该过滤器
public class Filter1 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    public void destroy() {

    }
}
