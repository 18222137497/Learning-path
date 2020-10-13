package cn.itcast.web.Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;

@WebListener
public class listener implements ServletContextListener {
    /**
     * servletContext对象被创建时候调用
     *  一般用来加载文件
     *  在服务器开启时候自动调用
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //加载资源文件
        //1.获取servletContext对象
        ServletContext servletContext = servletContextEvent.getServletContext();
        //2.加载文件
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        //3.获取真实路径
        String realPath = servletContext.getRealPath(contextConfigLocation);
        //4.加载进内存
        try{
            FileInputStream fis=new FileInputStream(realPath);
            System.out.println(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(servletContext+"被创建");
    }

    /**
     * servletContext对象被销毁时调用
     * 在服务器关闭的时候自动调用
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        System.out.println(servletContext+"被销毁");
    }
}
