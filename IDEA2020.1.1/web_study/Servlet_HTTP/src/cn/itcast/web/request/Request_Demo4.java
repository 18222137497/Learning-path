package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/Request_Demo4")
public class Request_Demo4 extends HttpServlet {
    /*                  Parameter(参数)
        1.其他功能
            1.获取请求参数通用方式：不论get还是post请求方式都可以使用下列方法来获取请求参数
                1.String getParameter(String name):根据参数名称获取参数值   username=zs&password=123
                2.String[] getParameterValues(String name):根据参数名称获取参数值的数组 hobby=xx&hobby=game
                3.Enumeration<String> getParameterNames():获取所有请求的参数名称
                4.Map<String,String[]> getParameterMap():获取所有参数的map集合
                * 中文乱码问题：
                    *get方式:tomcat 8 已经将get方式乱码问题解决了
                    *post方式:会乱码
                        *解决：在获取参数前，设置request的编码request.setCharacterEncoding("utf-8");
            2.请求转发：一种在服务器内部的资源跳转方式
                1.步骤：
                    1.通过request对象获取请求转发器对象：
                        RequestDispatcher getRequestDispatcher(String path)
                    2.使用RequestDispatcher对象来进行转发:
                        forward(ServletRequest request,ServletResponse response)
                2.特点：
                    1.浏览器地址栏路径不会发生变化
                    2.只能转发到当前服务器内部资源中
                    3.转发是一次请求
            3.共享数据：
                *域对象：一个有作用范围的对象，可以在范围内共享数据
                *request域：代表一次请求的范围，一般用于请求转发多个资源中共享数据
                *方法：
                    1.void setAttribute(String name,Object obj):存储数据
                    2.object getAttitude(String name):通过键获取值
                    3.void removeAttribute(String name):通过键移除键值对
            4.获取ServletContext：
                *ServletContext getServletContext()
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");//修改字符集，不然中文会乱码
        //post获取请求参数
        String username = request.getParameter("username");//根据请求参数的名称获取请求参数的值
        String[] hobbies = request.getParameterValues("hobby");//根据i请求参数名称获取请求参数的值的数组，多用于多选
        Enumeration<String> pn = request.getParameterNames();//获取所有请求的参数名称

        System.out.println("--------------------------");
        System.out.println("username="+username);
        System.out.println("--------------------------");
        System.out.print("爱好：");
        if (hobbies!=null){//这个为空的话下面会报错,这个空的原因是因为复选框没有任意一个被选中的话，客户端不会返回这个复选框的参数名称，就是不存在这个参数
            for (String s : hobbies) {//foreach后面那个参数不能为null，不然会报出空指针异常
                System.out.print(s+"    ");
            }
        }
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("获取所有请求参数名称");
            while (pn.hasMoreElements()) {
                String name = pn.nextElement();
                System.out.println(name + ":" + request.getParameter(name));//获取多个要获取数组
            }
        System.out.println("--------------------------");
        Map<String, String[]> pm = request.getParameterMap();//获取所有参数的map集合
        Set<String> set = pm.keySet();
        for (String s : set) {
            String[] value = pm.get(s);
            System.out.print(s+"=");
            for (String s1: value) {//这里不用判断是否为空的原因是如果复选框没有被选中任何值，则不会返回复选框的参数，也就不会被getParameterMap接收
                System.out.print(s1+" ");
            }
            System.out.println();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //get获取请求参数
//        //根据请求参数的名称获取请求参数的值
//        String username = request.getParameter("username");
//        System.out.println("get--"+username);
        this.doPost(request,response);
    }
}
