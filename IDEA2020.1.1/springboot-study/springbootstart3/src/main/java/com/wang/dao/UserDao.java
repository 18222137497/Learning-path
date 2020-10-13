package com.wang.dao;

import com.wang.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper//表示这是一个mybatis的mapper类
@Repository
public interface UserDao {
    @Select("select * from user")
    List<User> findAll();
    @Select("select * from user where id=#{id}")
    User findUserById(int id);
    @Insert("insert into user values(#{id},#{username},#{birthday},#{sex},#{address})")
    int addUser(User user);
    @Update("update user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
    int updateUser(User user);
    @Delete("delete from user where id=#{id}")
    int deleteUser(int id);
}
