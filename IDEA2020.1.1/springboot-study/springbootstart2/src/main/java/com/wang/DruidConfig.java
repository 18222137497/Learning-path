package com.wang;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class DruidConfig {
    //装入容器，并载入配置
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }
    //后台监控功能
    @Bean//加入组件
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        //后台需要有人登录，账号密码配置
        HashMap<String, String> initParameters = new HashMap<>();
        //增加配置
        initParameters.put("loginUsername","18222137497@163.com");//登录key 是固定的loginUsername loginPassword
        initParameters.put("loginPassword","123456");//登录key 是固定的loginUsername loginPassword
        //允许谁可以访问
        initParameters.put("allow","");//空为谁都可以访问，localhost表示只有本机可以访问
        //禁止谁访问
        initParameters.put("kuangshen","192.168.1.1");

        bean.setInitParameters(initParameters);//设置初始化参数
        return bean;
    }

    //filter过滤器，表示访问什么资源时候不会控制台监控记录
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());//设置过滤器相关配置的类
        //可以过滤那些请求呢？
        HashMap<String, String> initParameters = new HashMap<>();
        //这些东西不进行统计
        initParameters.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParameters);
        return bean;
    }
}
