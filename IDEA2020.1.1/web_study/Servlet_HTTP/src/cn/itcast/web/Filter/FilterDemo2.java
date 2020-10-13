package cn.itcast.web.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo2 implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //对request的消息进行增强
        System.out.println("filterDemo1来了");
        //放行
        chain.doFilter(req, resp);
        //对response的消息进行增强
        System.out.println("filterDemo1又回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {

    }

}
