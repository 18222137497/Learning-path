package com.wang.servlet;

import com.wang.domain.Aa;
import com.wang.domain.Account;
import com.wang.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制类
@Controller
@RequestMapping("/new")
public class HelloServlet {
    /**
     * RequestMapping注解的作用是建立请求URL和处理方法之间的对应关系
     *  可以作用在方法和类上
     *      1.作用在类上是一级访问目录
     *      2.作用在方法上是二级访问目录
     *      3.细节：路径可以不编写/表示应用的根目录开始
     *      4.${pageContext.request.contextPath}可以省略不写，但是路径上不能写/
     *   属性：
     *      path=value 指定请求路径的url
     *      method 指定该方法的请求方式
     *      params 指定限制请求参数的条件
     *      headers 发送的请求中必须包含的请求头
     * @return
     */
    @RequestMapping(path = "/hello",method = RequestMethod.GET,params = {"username"},headers = {"date"})
    public String hello(){
        System.out.println("入门");
        return "succeed";
    }
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String submit(Account account){
        System.out.println("提交了表单");
        System.out.println(account);
        return "succeed";
    }
    @RequestMapping("/student")
    public String student(Student student){
        System.out.println(student);
        return "succeed";
    }
    @RequestMapping(path = "/meiju",method = RequestMethod.POST)
    public String meiju(Aa aa){
        System.out.println(aa);
        return "succeed";
    }

}
