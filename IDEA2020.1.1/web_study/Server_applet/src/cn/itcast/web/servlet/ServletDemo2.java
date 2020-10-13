package cn.itcast.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Servlet的方法
 *  servlet生命周期问题
 *      1.被创建 执行init方法 执行一次
 *          * Servlet什么时候被创建？
 *              * 默认情况下，第一次被访问时创建
 *              * 可以配置执行servlet的创建时机
 *      2.提供服务 执行service方法
 *      3.被销毁 执行destroy方法 执行一次
 */
@WebServlet("/demo2")//这里只需要填一个资源路径就行(就是取一个调用的名字)
public class ServletDemo2 implements Servlet {
    /**
     * 初始化方法
     *  特点：在servlet被创建时候执行，只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init........");
    }

    /**
     * 获取servletConfig对象，servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法
     *  特点：每一次servlet被访问的时候都执行一次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service.......");
    }

    /**
     * 获取servlet的一些信息，版本，作者。。。。
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     *  在servlet被杀死时执行，
     *      在服务器正常关闭的时候执行
     */
    @Override
    public void destroy() {
        System.out.println("destroy........");
    }
}
