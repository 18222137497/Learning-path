package com.wang.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {
    @RequestMapping("login")
    public String message(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession httpSession){
        if (!StringUtils.isEmpty(email) && "123456".equals(password)){
            httpSession.setAttribute("loginUser",email);
            //httpSession.invalidate();使session失效，等于remove
            return "redirect:/top";//重定向，下划线可以忽略，已经配置了视图解析器
        }else {
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }

}
