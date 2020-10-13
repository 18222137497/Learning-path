package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/Request_Demo3")
public class Request_Demo3 extends HttpServlet {
    /*
                     3.获取请求体数据
                            *请求体：只有POST请求方式，菜哦有请求体，在请求体中封装了POST请求的请求参数
                            *步骤
                                1.获取流对象
                                    *BufferedReader getReader(): 获取字符输入流，只能操作字符数据
                                    *ServletInputStream getInputStream():获取字节输入流，可以操作搜游类型数据
                                        *在文件上传知识点后讲解
                                2.再从流对象中拿数据
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求体数据
        BufferedReader reader = request.getReader();//获取流对象
        String  line=null;
        while((line=reader.readLine())!=null){//读
            System.out.println(line);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
