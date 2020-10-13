package com.wang.servlet;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/servlet")
public class Servlet {
    /**
     * 传统文件上传
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @RequestMapping("/fileUpload0")
    public String fileUpload(HttpServletRequest httpServletRequest) throws Exception {
        System.out.println("传统文件上传");
        //使用fileupload组件完成文件上传
        //上传位置
        String path = httpServletRequest.getSession().getServletContext().getRealPath("/upload/");
        //判断，该路径是否存在
        File file=new File(path);
        if (!file.exists()){
            //创建该文件
            file.mkdirs();
        }
        //解析request对象，获取文件上传项
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        //解析request
        List<FileItem> fileItems = servletFileUpload.parseRequest(httpServletRequest);
        //遍历
        for (FileItem fileItem:fileItems){
            //进行判断，当前item对象是否是上传文件项
            if (fileItem.isFormField()){
                //说明是普通表单项
            }else {
                //说明上传文件项
                //获取上传文件的名称
                String name = fileItem.getName();
                //把文件的名称设置唯一值 uuid
                String uuid = UUID.randomUUID().toString().replace("-", "");
                name=uuid+"_"+name;
                //完成文件上传、
                fileItem.write(new File(path,name));
                //删除临时文件
            }
        }
        return "succeed";

    }

    /**
     * springMvc文件上传
     */
    @RequestMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest httpServletRequest, MultipartFile upload) throws IOException {
        System.out.println("springmvc文件上传");
        //这段代码的意思是获取webapp目录下的upload文件夹的url(文件夹可以不存在)
        String realPath = httpServletRequest.getSession().getServletContext().getRealPath("/upload/");
        //判断文件夹是否存在
        File file=new File(realPath);
        if (!file.exists()){//文件夹如果不存在
            //不存在就创建
            file.mkdirs();
        }
        //说明上传文件项
        //获取上传文件的名称
        String originalFilename = upload.getOriginalFilename();//获取上传的文件名字
        //把文件的名称设置唯一值
        String uuid = UUID.randomUUID().toString().replace("-", "");//创建一个uuid，并把-换成 空
        originalFilename=uuid+"_"+originalFilename;//uuid+_+上床的文件的名字(防止同名称文件上传出现的覆盖)
        //完成文件上传
        upload.transferTo(new File(realPath,originalFilename));//文件上传(参数为文件对象，双参数的意思是拼接)
        return "succeed";
    }

    /**
     * 跨服务器上传
     * @param upload
     * @return
     * @throws IOException
     */
    @RequestMapping("/fileUpload2")
    public String fileUpload2(MultipartFile upload) throws IOException {
        System.out.println("跨服务器传输");
        //定义上传文件的路径
        String path="http://localhost:8080/image_server_war/uploads/";
        //说明上传文件项
        //获取上传文件的我名称
        String originalFilename = upload.getOriginalFilename();
        //把文件设置唯一id
        String uuid = UUID.randomUUID().toString().replace("-", "");
        originalFilename=""+originalFilename;
        //创建客户端的对象
        Client client = Client.create();
        //和图片服务器进行连接
        WebResource resource = client.resource(path+originalFilename);
        //上传文件
        resource.put(upload.getBytes());
        return "succeed";
    }
}
