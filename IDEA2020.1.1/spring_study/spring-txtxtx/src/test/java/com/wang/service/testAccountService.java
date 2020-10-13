package com.wang.service;

import com.wang.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class testAccountService {
    @Autowired
    private AccountService accountService;
    @Test
    public void testFindAll(){
        accountService.zhuanzhang("bbb","aaa",100f);
    }
}
