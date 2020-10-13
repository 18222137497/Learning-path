package org.example.Dao;

import org.example.Domain.User;
import org.example.mybatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select("select * from user")
    List<User> findAll();
}
