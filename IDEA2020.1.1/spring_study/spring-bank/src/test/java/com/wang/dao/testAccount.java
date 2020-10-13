package com.wang.dao;

import com.wang.domian.Account;
import com.wang.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class testAccount {
    @Autowired
    @Qualifier("accountServiceProxy")
    private AccountService accountService;
    @Test
    public void testFindAllAccount(){
        List<Account> allAccount = accountService.findAllAccount();
        for (Account a : allAccount) {
            System.out.println(a);
        }
    }
    @Test
    public void testZhanzhuang(){
        accountService.zhuanzhang("bbb","aaa", 100f);
    }
}
