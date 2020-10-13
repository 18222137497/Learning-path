package cn.itcast.web.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cookie_Demo2")
public class Cookie_Demo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            3.实现原理
                *基于响应头set-cookie和请求头cookie实现
            4.cookie的细节
                1.一次可不可以发送多个cookie？
                    * 可以
                    * 可以创建多个Cookie对象，使用response调用多次addCookie方法发送cookie即可
                2.cookie在浏览器中保存多长时间？
                    1.默认情况下，挡路兰奇关闭后，Cookie数据被销毁
                    2.持久化储存：
                        *setMaxAge(int seconds)   参数，存活时间 秒
                            1.正数：将Cookie数据写到硬盘的文件中。持久化储存。并指定cookie存活时间，时间到后cookie文件自动失效
                            2.负数：默认值
                            3.零：删除cookie信息
                    3.Cookie能不能存中文？
                        *在tomcat8之前cookie中不能直接存数中文数据
                            *需要将正文数据转码--一般采用URL编码(%E3)
                        *在tomcat8之后。cookie支持中文数据，特殊字符还是不支持，建议使用URL编码储存，URL节码解析(具体看js基础md)
                    4.Cookie共享问题？
                        1.假设在一个tomcat服务器中，部署了多个web项目，南无在这些web项目中Cookie能共享马？
                            *默认情况下cookie不能共享
                            *setPath(String path)：设置Cookie的获取范围。默认情况下，设置当前的虚拟目录
                                如果要共享，贼可以将path设置为"/"
                        2.不同的tomcat服务器间cookie共享问题
                            *setDomain(String path):如果色绘制一级域名相同，南无多个服务器之间cookie可以共享
                                *setDomain(".baidu.com"),那么tieba.baidu.com和news.baidu.com中cookie可以共享
                    5.Cookie的特点和作用
                        1.cookie储存数据在客户端浏览器
                        2.浏览器对于单个cookie的大小有限制(4kb)一级对同一个域名下的总cookie数量也有限制
                        *作用：
                            1.cookie一般用于存储少量的不太敏感的数据
                            2.在不登录的情况下，完成服务器对客户端的身份识别
         */
        //一次发送多个Cookie
        Cookie cookie = new Cookie("msg", "hello");
        Cookie cookie1 = new Cookie("msg1", "hello1");
        Cookie cookie2 = new Cookie("msg2", "hello2");
        response.addCookie(cookie);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        //cookie在浏览器中保存多长时间？
        cookie.setMaxAge(200);
    }
}
