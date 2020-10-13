package com.wang.springbootstart.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource(value = "classpath:wang.properties")//加载指定配置文件
public class School {
    @Value("${name}")
    private String name;
    private String LV;

    public School() {
    }

    public School(String name, String LV) {
        this.name = name;
        this.LV = LV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLV() {
        return LV;
    }

    public void setLV(String LV) {
        this.LV = LV;
    }

    @Override
    public String toString() {
        return "school{" +
                "name='" + name + '\'' +
                ", LV='" + LV + '\'' +
                '}';
    }
}
