package com.wang.uitl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/**
 * 一个创建Bean对象的工厂
 *
 * Bean：在计算机英语中，有可重用组件的含义。
 * JavaBean：用java语言编写的可重用组件。
 *      javabean >  实体类
 *
 *   它就是创建我们的service和dao对象的。
 *
 *   第一个：需要一个配置文件来配置我们的service和dao
 *           配置的内容：唯一标识=全限定类名（key=value)
 *   第二个：通过读取配置文件中配置的内容，反射创建对象
 *
 *   我的配置文件可以是xml也可以是properties
 */
public class Bean {
    private static Properties properties;
    private static Map<String ,Object> map;
    static {
        try {
            //实例化对象
            properties=new Properties();
            //读取文件的流对象
            InputStream i = Bean.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(i);
            //实例化容器
            map=new HashMap<String,Object>();
            //取出配置文件中所有的Key
            Enumeration<Object> keys = properties.keys();
            //遍历枚举
            while (keys.hasMoreElements()){
                //取出每一个key
                String key = keys.nextElement().toString();
                //根据key获取值
                String property = properties.getProperty(key);
                //反射创建对象
                Object value = Class.forName(property).getDeclaredConstructor().newInstance();
                //把key和value存入容器中
                map.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("传入参数异常");
        }

    }

    /**
     * 根据bean的名称获取对象
     * @param beanName
     * @return
     */
    public static Object getBeanMap(String beanName){
        return map.get(beanName);
    }
    /**
     * 根据Bean的名称获取bean对象
     * @param beanName
     * @return
     */
    public Object getBean(String beanName){
        Object bean = null;
        String property = properties.getProperty(beanName);
        try {
            bean = Class.forName(property).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
