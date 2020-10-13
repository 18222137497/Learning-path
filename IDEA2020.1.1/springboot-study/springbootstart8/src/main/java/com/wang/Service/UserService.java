package com.wang.Service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //想拿到票
    //去注册中心拿
    @DubboReference//引用， 第一种方式 pom坐标，可以定义路径相同的接口名
    TicketService ticketService;
    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心拿到"+ticket);
    }

}
