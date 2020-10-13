package com.wang.dao.imp;

import com.wang.dao.UserDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
@Repository("userDao1")
public class UserDaoImpl1 implements UserDao {
    private Date date;
    private List<String> list;
    private Set<String> set;
    private Properties properties;
    @Override
    public void Save() {
        System.out.println("UserDaoImpl1{" +
                "date=" + date +
                ", list=" + list +
                ", set=" + set +
                ", properties=" + properties +
                '}');
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
