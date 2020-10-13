package cn.itcast.web.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*") // "/*"访问所有资源之前都会执行过滤器
public class FilterDemo1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //开启服务器时候执行一次，只执行一次
        //用于加载资源
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
        /*
            1.过滤器细节
                1.web.xml配置
                    * 看web.xml文件里
                2.过滤器执行流程
                    1.执行过滤器
                    2.执行放行后的资源
                    3.回来执行过滤器方形代码下面的代码
                3.过滤生命周期的方法
                    1.init:在服务器启动后，会创建Filter对象，然后调用init方法，只执行一次，用于加载资源
                    2.doFilter:每一次请求被拦截资源时，会执行，会执行多次
                    3.destroy:在服务器关闭后，Filter对象被销毁，如果服务器时正常关闭，则会执行destroy方法，只执行一次，用于释放资源
                4.过滤器配置详解
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
                5.过滤器链(配置多个过滤器)
                    * 执行顺序：如果有两个过滤器：过滤器1和过滤器2
                        1.过滤器1
                        2.过滤器2
                        3.资源执行
                        4.过滤器2
                        5.过滤器1
                    * 过滤器先后顺序问题:
                        1.注册配置：按照类名的字符串比较规则比较，值小的先执行
                            * 如：AFilter 和 BFilter , AFilter就先执行了
                        2.web.xml配置：<filter-mapping>谁定义在上边，谁先执行
         */



    }

    @Override
    public void destroy() {
        //关闭服务器的时候执行一次，只执行一次
    }
}
