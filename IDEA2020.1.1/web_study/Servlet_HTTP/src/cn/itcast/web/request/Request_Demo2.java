package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

@WebServlet("/Request_Demo2")
public class Request_Demo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
                    2.获取请求头数据
                            *方法：
                                *(*)String getHeader(String name):通过请求头名称获取请求头的值
                                *Enumeration<String> getHeaderNames():获取所有的请求头名称
 */
        //获取请求头数据:user-agent  告诉服务器，客户端的版本(请求头不区分大小写)
        String user_agent = request.getHeader("user-agent");
        if (user_agent.contains("Chrome")) {
            System.out.println("谷歌浏览器");
        }else if(user_agent.contains("Firefox")){
            System.out.println("火狐浏览器");
        }
        System.out.println(user_agent);
        //获取请求头数据:referer  (告诉浏览器从那里来)
        String referer = request.getHeader("referer");
        if (referer==null){
            System.out.println("直接从地址栏里输入的地址(从地址栏访问的该网址)");
        }else{
            System.out.println(referer);
        }
        if (referer!=null){
            if (referer.contains("/Servlet_HTTP/")){
                System.out.println("从官方网站访问");
            }else{
                //盗链
                System.out.println("从非官方网站访问！！！");
            }
        }



        //获取所有请求头名称和对应的数据
//        Enumeration<String> headerNames = request.getHeaderNames();//这个其实就是一个迭代器，不能用foreach遍历
//        while (headerNames.hasMoreElements()){
//            String next = headerNames.nextElement();
//            String header = request.getHeader(next);
//            System.out.println(next+":"+header);
//        }
        //这个Enumeration接口有一个方法可以转换成迭代器Iterator，效果差不多，Iterator效率貌似更高一点
//        Iterator<String> si = headerNames.asIterator();//转换后的用法
//        while(si.hasNext()){
//            String next = si.next();
//            String header = request.getHeader(next);
//            System.out.println(next+":"+header);
//        }

    }
}
