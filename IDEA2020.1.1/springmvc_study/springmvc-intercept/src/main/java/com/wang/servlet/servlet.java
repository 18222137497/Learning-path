package com.wang.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servlet")
public class servlet {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("Controller执行了");
        return "succeed";
    }
}
