package com.wang.springbootstart.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
@Component
@ConfigurationProperties(prefix = "person")//获取yml参数值，绑定前缀
//@Validated //数据校验   JSR303语法校验
public class Person {
//    @Email(message = "邮箱语法格式错误") //该属性必须是邮件形式，不是就会抛出message提醒
    private String name;
    private int age;
    private Date birthday;
    private School school;

    public Person() {
    }

    public Person(String name, int age, Date birthday, com.wang.springbootstart.pojo.School school) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public com.wang.springbootstart.pojo.School getSchool() {
        return school;
    }

    public void setSchool(com.wang.springbootstart.pojo.School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", school=" + school +
                '}';
    }
}
