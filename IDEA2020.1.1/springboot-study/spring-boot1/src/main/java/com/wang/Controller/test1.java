package com.wang.Controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自动查询并配置
 */
@Controller
@ConfigurationProperties(prefix = "user")//查找yml文件中的user对象
public class test1 {
    private String name;//这个属性必须被符与get和set方法才行，不然会报错
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
    return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
