package com.wang.Controller;

import com.wang.pojo.MyUser;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyController {

    @ApiOperation("MyController类") //给这个Controller方法注释
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "hello";
    }
    //只要我们的接口中，返回值中存在实体类，他就会被扫描到swagger中
    @GetMapping("/test1")
    public MyUser test1(@ApiParam("给属性注释") String arr){
        return new MyUser();
    }
}
