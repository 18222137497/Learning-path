package com.wang.serivce;

import com.wang.service.AccountService;
import com.wang.uitl.Bean;
import org.junit.Test;

public class testAccountService {
    @Test
    public void test(){
        for (int i=0;i<10;i++) {
            AccountService accountService = (AccountService) Bean.getBeanMap("accountService");
            System.out.println(accountService);
            accountService.Service();
        }
    }
}
