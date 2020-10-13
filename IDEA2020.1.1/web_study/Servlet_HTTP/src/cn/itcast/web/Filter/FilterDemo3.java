package cn.itcast.web.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//转发和直接访问都经过这个过滤器
@WebFilter(value="/*",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class FilterDemo3 implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        /*    4.过滤器配置详解
                            * 拦截路径配置：
                                1.具体资源路径：/index.jsp 只有访问index.jsp资源时，过滤器才会被执行
                                2.拦截目录： /user/*  访问/user下的所有资源时，过滤器都会被执行
                                3.后缀名拦截： *.jsp 访问所有后缀名为jsp资源时，过滤器都会被执行
                                4.拦截所有资源： /* 访问所有资源时，过滤器都会被执行
                            * 拦截方式配置：资源被访问的方式
                                    * 注解配置：
                                        * 设置dispatcherType属性
                                            1.REQUEST: 默认值，浏览器直接请求资源
                                            2.FORWARD: 转发访问资源
                                            3.INCLUDE: 包含访问资源
                                            4.ERROR: 错误跳转资源
                                            5.ASYNC: 异步访问资源
                                    * web.xml
                                        * 设置<dispatcher></dispatcher>标签即可
         */
        System.out.println("我是转发访问");
    }

    public void destroy() {

    }

}

