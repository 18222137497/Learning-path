package com.wang.dao.imp;

import com.wang.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Map;
/*
    用于创建对象的
       他们的作用就和在XML配置文件中编写一个<bean>标签实现的功能是一样的
           Component:
               作用：用于把当前类对象存入spring容器中
               属性：
                   value：用于指定bean的id。当我们不写时，它的默认值是当前类名，且首字母改小写。
           Controller：一般用在表现层
           Service：一般用在业务层
           Repository：一般用在持久层
       以上三个注解他们的作用和属性与Component是一模一样。
       他们三个是spring框架为我们提供明确的三层使用的注解，使我们的三层对象更加清晰
 */
//@Component("userDao0")
@Repository("userDao0")//类似设置bean标签的id
public class UserDaoImpl implements UserDao {
    private Integer age;
    private String name;
    private String[] names;
    private Map<String,Integer> map;
    @Override
    public void Save() {
        System.out.println("UserDaoImpl{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", names=" + Arrays.toString(names) +
                ", map=" + map +
                '}');
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

}
