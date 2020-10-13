package com.wang.Controller;

import com.wang.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private MyService myService;


    @GetMapping("/test")
    @Async//这是个异步任务
    @ResponseBody
    public String test() throws InterruptedException {
        System.out.println("异步任务执行");
        myService.test1();
        return "OK";//异步任务这个返回值没有显示到网页中？？
    }

}
