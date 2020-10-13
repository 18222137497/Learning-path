package com.wang.ui;


import com.wang.dao.AccountDao;
import com.wang.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    /**
     * 获取spring的ioc核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类
     *      ClassPathXmlApplicationContext:它可以加载类路径下的配置文件，要求配置文件必须在类路径下，不在的话，加载不了，（常用）
     *      FileSystemXmlXmlApplicationContext:他可以加载磁盘任意路径下的配置文件(必须有访问权限)
     *
     *      AnnotationConfigApplicationContext:它是用于读取注解创建容器的，是明天的内容
     *
     *  核心容器的两个接口引发出的问题：
     *      ApplicationContext： 单例对象适用     采用此接口
     *          他在构造核心容器时，创建独享采取的策略是立即加载，可就是只要一读取完配置文件就马上创建配置文件中的配置对象
     *      BeanFactory:         多例对象使用
     *          他在构建核心容器时，创建对想采取的策略是采用延迟加载的方式，也就是说，什么时候根据id获取对象了，什么时候才真正的创建对象
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext as=new ClassPathXmlApplicationContext("bean.xml");

        //获取Object对象，自己强转
//        AccountService accountService =(AccountService) as.getBean("accountService");
        //传入字节码，让他通过字节码强转类型
//        AccountDao accountDao = as.getBean("accountDao", AccountDao.class);

//        System.out.println(accountDao);
//        System.out.println(accountService);
        //---------------BeanFactory--------------------
        Resource resource=new ClassPathResource("bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        AccountService accountService = factory.getBean("accountService", AccountService.class);
        System.out.println(accountService);
    }
}
