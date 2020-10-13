package com.wang.springConfig;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * 该类是一个配置类，他的作用和bean.xml是一样的
 * spring中的新注解
 * Configuration
 *      作用：指定当前类是一个配置类
 * ComponentScan
 *      作用：用于通过注解指定spring在创建容器时要扫描的包
 *      属性：
 *          value：他和 basePackages 的作用时一样的，都是用于指定创建容器时需要扫描的包
 *                 等同于<context:component-scan base-package="com.wang"></context:component-scan>
 * Bean:
 *      作用：用于把当前方法的返回值作为bean独享存入spring的ioc容器中
 *      属性：
 *          name用于指定bean的id，当不写时，默认值是当前方法的名称
 *      细节：
 *          当我们使用注解配置方法时，如果方法有参数，spring框架回去容器中查找有没有可用的bean对象
 *          查找的方式和@Autowired一样
 * Import:
 *      作用:用于导入其他的配置类
 *      属性:
 *          value：用于指定其他配置类的字节码，
 *                  当我们使用Import的注解之后，有Import注解的类就是父配置类，而导入的都是子配置类
 * PropertySource：
 *      作用：用于指定properties文件的位置
 *      属性：
 *          value：指定文件的名称和路径
 *              关键字：classpath，表示类路径下
 * Qualifier("dataSource"):
 *      作用：用于指定方法或者属性或者参数定义spring容器的id
 *      属性：
 *          value：在方法上时指定方法返回值的id
 *                  在属性上或者参数上定义改对象的id
 *
 */
@Configuration//指定当前类是一个配置类
@ComponentScan("com.wang")//相当于<context:component-scan base-package="com.wang"></context:component-scan>
@Import(jdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class config {
    
}
