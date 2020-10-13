package cn.itcast.servlet;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.apache.commons.beanutils.BeanUtils;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Set;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置编码
        request.setCharacterEncoding("utf-8");
//        //2.获取请求参数
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        //3.封装user对象
//        User user=new User();
//        user.setUsername(username);
//        user.setPassword(password);
        //2.获取所有请求参数
        Map<String, String[]> pm = request.getParameterMap();
        //3.创建user对象
        User loginUser=new User();
        //3.2用BeanUtils封装
        try {
            BeanUtils.populate(loginUser,pm);//user对象属性必须是private不能用static修饰，有getset方法，类必须被public修饰
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //4.调用UserDao的login方法
        UserDao dao=new UserDao();
        User login = dao.login(loginUser);
        if (login==null){
            //登录失败
            request.getRequestDispatcher("/FailServlet").forward(request,response);

        }else{
            //登录成功
            //存储数据
            request.setAttribute("user",loginUser);
            //转发
            request.getRequestDispatcher("/SuccessServlet").forward(request,response);


        }

    }
}
