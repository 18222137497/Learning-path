package cn.itcast.web.Context;

import cn.itcast.web.utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class downloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        //1.获取请求参数,文件名称
        String filename = request.getParameter("filename");
        //2.使用字节输入流加载文件进内存
        //2.1找到文件服务器路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/"+filename);
        //2.2用字节流关联
        FileInputStream fs=new FileInputStream(realPath);//读进内存了
        //3.设置response的响应头
        //3.1设置响应头 类型 content-type
        String mimeType = servletContext.getMimeType(filename);//获取文件的mime类型
        response.setContentType(mimeType);
        //3.2设置响应头 打开方式 content-disposition
        //3.3解决中文文件名问题
            //1.获取user-agent请求头
            String agent = request.getHeader("user-agent");
            //2.使用工具类方法编码文件名即可
            filename=DownLoadUtils.getFileName(agent,filename);
        response.setHeader("content-disposition","attachment;filename="+filename);
        //4.将输入流的数据写出到输出流中
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] b=new byte[1024*8];
        int len=-1;
        while ((len=fs.read(b))!=-1){
            outputStream.write(b,0,len);
        }
        fs.close();

    }
}
