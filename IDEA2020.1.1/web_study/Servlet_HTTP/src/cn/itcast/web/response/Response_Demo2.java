package cn.itcast.web.response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/Response_Demo2")
public class Response_Demo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            1.完成重定向
                *重定向：资源跳转的方式
                *代码实现：
                    1.设置状态码302
                        response.setStatus(302)
                    2.设置响应体location：
                        response.setHeader("location","/Servlet_HTTP/Response_Demo2");
                    3.简单的重定向方法
                        response.setHeader("/Servlet_HTTP/Response_Demo2");
                *重定向的特点：redirect
                    1.地址栏发生变化
                    2.重定向可以访问其他站点(服务器)的资源
                    3.重定向是两次请求。不能使用request对象来共享数据
                *转发的特点:forward
                    1.转发地址栏路径不变
                    2.转发只能访问当前服务器下的资源
                    3.转发是一次请求，可以使用request对象来共享数据
                *forward和redirect区别
                *路径写法：
                    1.路径分类：
                        1.相对路径：通过相对路径不可以确定唯一资源
                            *如：./index.html
                            *不以/开头，以.开头路径
                            *规则：找到当前资源和目标资源之间的相对位置关系
                                *./:当前目录
                                *../:上一级目录
                        2.绝对路径：通过绝对路径可以确定唯一资源
                            *如:http://localhost/day15/responseDemo2         /day15/responseDemo2
                            *以/开头的路径
                            *规则：判断定义的路径是给谁用的？判断请求将来从哪发出
                                *给客户端浏览器使用：需要加虚拟目录(项目的访问路径)
                                    *建议虚拟目录动态获取
                                        request.getContextPath()
                                    *<a>,<form>重定向..
                                *给服务器使用不需要加虚拟目录
                                    *转发路径
         */
        System.out.println("demo2...");
        //1.设置状态码为302
        //response.setStatus(302);//重定向1
        //2.设置响应头为location
        //response.setHeader("location","/Servlet_HTTP/Response_Demo1");//重定向2
        //重定向简单方式：response.sendRedirect("/Servlet_HTTP/Response_Demo1");
        /*
            2.服务器输出字符数据到浏览器
                *步骤：
                    1.获取字符输出流
                    2.输出数据
                *注意：
                    *乱码问题：
                        1.PrintWriter pw=response.gteWriter();获取的流的默认编码为ISO-8859-1
                        2.设置该流的默认编码
                        3.告诉浏览器响应体使用的编码
                        //简单形式，设置编码，是在获取流之前设置的
                            response.setContentType("text/html;charset=utf-8")
         */
        //获取流对象之前，设置流的默认编码
        //response.setHeader("Content-type","text/html;charset=utf-8");
        //简单形式
//            response.setContentType("text/html;charset=utf-8");
//            PrintWriter pw = response.getWriter();
//            pw.write("<h1>hello response</h1>");//这里可以写html代码，浏览器会自动解析

        /*
            3.服务器输出字节数据到浏览器
                    *步骤：
                        1.获取字节输出流
                        2.输出数据
                        */
//        ServletOutputStream sos = response.getOutputStream();
//        sos.write("你好".getBytes("utf-8"));
        /*
            4.验证码
                    1.本质：图片
                    2.目的：防止恶意表单注册
         */
        //1.创建一个对象，在内存中画图(验证码图片对象)
        int width=100;
        int height=50;
        BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //2.美化图片
        //2.1填充背景色
        Graphics g = bi.getGraphics();//画笔对象
        g.setColor(Color.pink);//设置画笔颜色
        g.fillRect(0,0,bi.getWidth(),bi.getHeight());//填充背景色
        //2.2画边框
        g.setColor(Color.BLUE);
        g.drawRect(0,0,bi.getWidth()-1,bi.getHeight()-1);//画边框
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //生成随机角标
        Random r=new Random();
        int x=20;
        for (int i=0;i<4;i++){
            int index=r.nextInt(str.length());//随机角标
            char c = str.charAt(index);//随机字符
            //2.3写验证码
            g.drawString(c+"",x,25);
            x+=20;
        }
        //2.4画干扰线
        g.setColor(Color.GREEN);
        for (int i = 0; i <4 ; i++) {
            int x1=r.nextInt(width);
            int x2=r.nextInt(width);
            int y1=r.nextInt(height);
            int y2=r.nextInt(height);
            g.drawLine(x1,y1,x2,y2);//画线
        }

        //3.将图片输出到页面展示
        ImageIO.write(bi,"jpg",response.getOutputStream());



    }
}
