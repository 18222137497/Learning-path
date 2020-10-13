package com.wang.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")//这个不写没事，/one也可以直接访问
public class start1 {
    @RequestMapping("/one")
    @ResponseBody//这个的意思是不走视图解析器，直接将返回值当成响应体
    public String test(){
        return "hello spring-boot";
    }
}
