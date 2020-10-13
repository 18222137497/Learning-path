package com.wang.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

//在templates中的所有资源只能通过Controller访问
@Controller
public class indexController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}