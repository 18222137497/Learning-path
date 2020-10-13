package com.wang.Service.Impl;

import com.wang.Service.TicketService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

//zookeeper:服务注册与发现

@Service
@DubboService//可以被扫描到，在项目启动就自动注册到注册中心
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "<票>";
    }
}
