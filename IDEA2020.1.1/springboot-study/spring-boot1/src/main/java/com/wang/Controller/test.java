package com.wang.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @Value("${student[0].name}")
    private String name;
    @RequestMapping("/test")
    public String test(){
        return "name="+name;
    }
}

