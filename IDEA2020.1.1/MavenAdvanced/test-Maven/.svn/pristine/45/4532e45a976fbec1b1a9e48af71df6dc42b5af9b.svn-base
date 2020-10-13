package com.wang.controller;

import com.wang.domain.Account;
import com.wang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/accountController")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/testFindAll")
    public String testFindAll(Model model){
        List<Account> all = accountService.findAll();
        model.addAttribute("list",all);
        return "list";
    }
}
