package com.wang.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.Controller;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
//根据配置文件环境不同控制swagger开关
@ConfigurationProperties(prefix = "swagger")  //这个需要重写对应的set方法,属性的命名不要以is开头，set方法会出问题
//@PropertySource("classpath:wang.yaml")   //指定配置文件注入可以生效，不需要写set方法
public class SwaggerConfig {

//    @Value("${swagger}")
    private boolean enOpen;

    @Bean//创建bean实例
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(enOpen)//关闭Swagger
                //配置swagger扫描，select 和 build是一套的
                .groupName("Afflatus")//设置分组名
                .select()
                //包扫描
                .apis(RequestHandlerSelectors.basePackage("com.wang.Controller"))
                //扫描全部any()，none()都不扫描
//                .apis(RequestHandlerSelectors.any()).build()
                //withMethodAnnotation扫描方法上的注解
//                .apis(RequestHandlerSelectors.withMethodAnnotation(GetMapping.class))
                //withClassAnnotation扫描类上的注解
//                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                //过滤什么路径
//                .paths(PathSelectors.ant("/wang/**"))//路径约束
//                .paths(PathSelectors.any())//全部过滤
//                .paths(PathSelectors.none())//全不过滤
//                .paths(PathSelectors.regex(""))//正则过滤
                .build()
                ;
    }
    //创建多个分组
    @Bean
    public Docket docket0(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }
    //配置swagger的信息=apiInfo
    private ApiInfo apiInfo(){
        Contact contact = new Contact("汪京",//作者名字
                "https://user.qzone.qq.com/252587065/infocenter",//个人地址
                "18222137497@163.com");//作者邮箱
        return new ApiInfo(
                "afflatus的SwaggerApi文档",//标题名字
                "这个文档是干什么干什么的",//描述信息
                "1.0",//版本
                "https://user.qzone.qq.com/252587065/infocenter",//组织地址
                contact,//配置一个作者信息
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );

    }

    public void setEnOpen(boolean enOpen) {
        this.enOpen = enOpen;
    }
}
