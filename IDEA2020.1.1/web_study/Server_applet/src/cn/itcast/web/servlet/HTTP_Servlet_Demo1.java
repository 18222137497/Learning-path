package cn.itcast.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("hsd1")
public class HTTP_Servlet_Demo1 extends HttpServlet {
    /**
     * 请求消息数据格式
     *      1.请求行
     *          请求方式     请求url   请求协议/版本
     *            GET   /login.html  HTTP/1.1
     *          * 请求方式
     *              *HTTP协议有7钟请求方式，常用两种
     *                  1.get：没有请求体
     *                      1.请求参数在请求行中，在url后
     *                      2.请求的url长度有限制
     *                      3.不太安全
     *                  2.post
     *                      1.请求参数在请求体中
     *                      2.请求的url长度没有限制
     *                      3.比较安全
     *      2.请求头：客户端浏览器告诉服务器一些信息
     *          请求头名称：请求头值
     *          * 常见的请求头：
     *              1.User-Agent：浏览器告诉服务器，我访问你使用的浏览器版本信息
     *                  *可以在服务器端获取该头的信息，解决浏览器的兼容问题
     *              2.Referer:http://localhost/login.html
     *                  *告诉服务器，我(当前请求)从哪来
     *                      *作用：
     *                          1.防盗链：
     *                          2.统计工作：
     *      3.请求空行
     *          空行，就是用于分割POST请求的请求头和请求体的
     *      4.请求体：(正文)
     *          * 封装POST请求消息的请求参数的
     *
     */
}
