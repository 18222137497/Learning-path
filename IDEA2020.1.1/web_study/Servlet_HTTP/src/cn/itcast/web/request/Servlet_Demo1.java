package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/demo1")
public class Servlet_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet_Demo1");

        /*
            Request:
                1.request对象和response对象的原理
                    1.request和response对象是由服务器创建的。我们来使用他们
                    2.request独享是来回去请求消息，response对象是来设置响应消息的
                2.request对象继承体系结构：
                    ServletRequest    --接口
                        |   继承
                    HttpServletRequest  --接口
                        |   实现
                    org.apache.catalina.connector.RequestFacade类(tomcat)
                3.request功能：
                    1.获取请求消息数据
                        1.获取请求行数据
                            * GET /Servlet_HTTP/demo1?name=zhangsan HTTP/1.1
                            * 方法：
                                1.获取请求方式：GET
                                    *String getMethod()
                                2.(*)获取虚拟目录：/Servlet_HTTP
                                    *String getContextPath()
                                3.获取servlet路径：/demo1
                                    *String getServletPath()
                                4.获取get方式请求参数：name=zhangsan
                                    *String getQueryString()
                                5.(*)获取请求URI：/Servlet_HTTP/demo1
                                    *String getRequestURI():    /Servlet_HTTP/demo1
                                    *StringBuffer getRequestURL():  http://localhost/Servlet_HTTP/demo1
                                    *URL:统一资源定位符: http://localhost/Servlet_HTTP/demo1 中华人民共和国
                                    *URL:统一资源标识符: /Servlet_HTTP/demo1                  共和国
                                6.获取协议及版本：HTTP/1.1
                                    *String getProtocol()
                                7.获取客户机的IP地址
                                    *String getRemoteAddr()
                        2.获取请求头数据
                            *方法：
                                *(*)String getHeader(String name):通过请求头名称获取请求头的值
                                *Enumeration<String> getHeaderNames():获取所有的请求头名称
                        3.获取请求体数据
                            *请求体：只有POST请求方式，菜哦有请求体，在请求体中封装了POST请求的请求参数
                            *步骤
                                1.获取流对象
                                    *BufferedReader getReader(): 获取字符输入流，只能操作字符数据
                                    *ServletInputStream getInputStream():获取字节输入流，可以操作搜游类型数据
                                        *在文件上传知识点后讲解
                                2.再从流对象中拿数据
         */


    }
}
