package cn.itcast.web.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SessionDemo2")
public class SessionDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            细节：
                1.当客户端关闭后，服务器不关闭，两次获取的Session是否是同一个
                    *默认情况下，不是
                    *如果需要相同，则可以创建Cookie，键为JSESSIONID，设置最大存活时间，让Cookie持久化保存
                        Cookie c = new Cookie("JSESSIONID",session.getId());
		                c.setMaxAge(60*60);
		                response.addCookie(c);
                2.客户端不关闭，服务器关闭后，两次获取的Session是否是同一个
                    *不是同一个，但是要确保数据不丢失，tomcat自动完成一下工作
                        *session的钝化：
                            *在服务器正常关闭之前，将session对象序列化到硬盘上
                        *session的活化
                            *在服务器启动后，将session文件转化为内存中的session对象即可
                3.Session什么时候被销毁？
                    1.服务器关闭
                    2.session对象调用invalidate()
                    3session默认失效时间 30分钟
                        选择性配置修改
                        <session-config>
			                <session-timeout>30</session-timeout>
			            </session-config>
            Session的特点：
                1.session用于储存一次会话的多次请求的数据，存在服务器端
                2.session可以储存任意类型，任意大小的数据
                * session与cookie的区别：
                    1.session储存数据在服务器端，cookie在客户端
                    2.session没有数据大小限制，cookie有4kb
                    3.session数据安全，cookie相对不安全
         */

    }
}
