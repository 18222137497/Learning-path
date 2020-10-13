package com.wang.Controller;

import com.wang.Service.AccountService;
import com.wang.domain.Account;
import com.wang.utils.myException.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/controller")
public class MyController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/testString")
    public String testString() throws Exception {
//        try {
//            int i=3/0;
//        } catch (Exception e) {
//            throw new SysException("by zero");
//        }
        accountService.find();
        return "succeed";
    }
    @RequestMapping("testList")
    public String testList(Model model){
        List<Account> all = accountService.findAll();
        model.addAttribute("list",all);
        return "list";
    }
}
