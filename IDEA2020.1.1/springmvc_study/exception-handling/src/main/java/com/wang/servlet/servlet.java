package com.wang.servlet;

import com.wang.utils.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servlet")
public class servlet {
    @RequestMapping("/testerror")
    public String testerror() throws Exception {
        System.out.println("方法执行");
        try {
            int i = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("by zero");
        }
        return "succeed";
    }
}
