package cn.itcast.web.Context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Context_Demo1")
public class Context_Demo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            1.概念：代表整个web应用，可以和程序的容器(服务器)来通信
            2.获取：
                1.通过request对象获取
                    request.getServletContext();
                2.通过HttpServlet获取
                    this.getServletContext();
            3.功能：
                1.获取MIME类型
                    *MIME类型：在互联网通信过程中定义的一种文件数据类型
                        *格式：大类型/小类型  text/html    image/jpeg
                    *获取：String getMimeType(String file)//参数传文件名(不存在的也行)加后缀
                2.域对象：共享数据
                    1.setAttribute(String name,Object value)
                    2.getAttribute(String name)
                    3.removeAttribute(String name)

                    *ServletContext对象范围:所有用户所有请求的数据
                3.获取文件的真实(服务器)路径
                    1.方法：String getRealPath(String path)
                        String b=context.getRealPath("/b.txt");//web目录下资源访问
                        String c = context.getRealPath("/WEB-INF/c.txt");//WEB-INF目录下的资源访问
                        String a = context.getRealPath("/WEB-INF/classes/a.txt");//src目录下的资源访问
         */
        //1.获取的两种方式
        ServletContext servletContext = request.getServletContext();
        ServletContext servletContext1 = this.getServletContext();
        //以上获取的两个ServletContext对象是同一个，相等的
        //2.获取MIME对象
        String html = servletContext.getMimeType("a.html");
        System.out.println(html);//text/html
        //3.域对象：共享数据
        servletContext.setAttribute("msg","haha");
        //4.获取文件的真实(服务器)路径
        String realPath = servletContext.getRealPath("/WEB-INF/classes/a.txt");//src下
        String realPath1 = servletContext.getRealPath("/WEB-INF/b.txt");//WEB-INF下
        String realPath2 = servletContext.getRealPath("1.html");//web下
        System.out.println(realPath);
        //E:\IDEA\wordspace\Servlet_HTTP\out\artifacts\Servlet_HTTP_war_exploded\WEB-INF\classes\a.txt
        System.out.println(realPath1);
        //E:\IDEA\wordspace\Servlet_HTTP\out\artifacts\Servlet_HTTP_war_exploded\WEB-INF\b.txt
        System.out.println(realPath2);
        //E:\IDEA\wordspace\Servlet_HTTP\out\artifacts\Servlet_HTTP_war_exploded\1.html
    }
}
