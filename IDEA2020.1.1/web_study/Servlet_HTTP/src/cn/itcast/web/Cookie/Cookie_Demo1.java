package cn.itcast.web.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cookie_Demo1")
public class Cookie_Demo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            会话技术：
                1.会话：一次会话中包含多次请求和响应
                    *一次会话：浏览器第一次给服务器资源发送请求，会话建立，知道有一方断开2为止
                2.功能：在一次会话的范围内的多次请求间，共享数据
                3.方式：
                    1.客户端会话技术：Cookie
                    2.服务器端会话技术：Session
            Cookie：
                1.概念：客户端会话技术，将数据保存到客户端
                2.快速入门：
                    * 使用步骤：
                        1.创建Cookie独享，绑定数据
                            *new Cookie(String name,String value)
                        2.发送Cookie对象
                            *response.addCookie(Cookie cookie)
                        3.获取Cookie，拿到数据
                            *Cookie[] request.getCookies()
                3.实现原理
                    *基于响应头set-cookie和请求头cookie实现
         */
        Cookie c=new Cookie("msg","hello");
        response.addCookie(c);

    }
}
