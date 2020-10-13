package cn.itcast.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/demo3")
public class ServletDemo3 extends GenericServlet {
    //GenericServlet只需实现service方法一个就行
    //HttpServlet获得doGet和doPost方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
