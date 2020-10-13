package com.wang.ui;

import com.wang.domain.Account;
import com.wang.service.AccountService;
import com.wang.springConfig.config;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用junit单元测试，测试我们的配置
 * spring整合junit的配置
 *  1.导入spring整合junit的jar(坐标)
 *  2.使用junit提供的一个注解把圆游的main方法替换了，替换成spring提供的
 *      @Runwith
 *  3.告知spring的运行器，spring和ioc创建是基于xml还是注解的，并说明位置
 *      @ContextConfigurtion
 *              location:指定xml文件的位置，加上classpath关键字，表示在类路径下
 *              classes:指定注解类所在地址
 *  当我们使用spring5.x版本的时候，要求junit的jar版本必须在4.12及以上
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = config.class)
public class Ttest {
    @Autowired
    private AccountService accountService;

    @Test
    public void findAll() {
        List<Account> all = accountService.findAll();
        for (Account a : all) {
            System.out.println(a);
        }
    }
}
