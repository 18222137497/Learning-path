package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/demo5","/d5","/user/*","*.do"})//可以有多个访问路径
/*
    通配符*，写什么都行
    *.do  这个前面不能加/   这个的意思就是.do结尾的路径
 */
public class ServletDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo5.......");
        System.out.println(req);
        System.out.println(resp);
    }
}
