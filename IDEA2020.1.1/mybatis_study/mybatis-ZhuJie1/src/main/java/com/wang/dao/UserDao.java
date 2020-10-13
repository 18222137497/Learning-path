package com.wang.dao;

import com.wang.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    @Results(id = "userMap",value = {
            @Result(id = true, property = "userId",column = "id"),
            @Result(property = "userName",column = "username"),
            @Result(property = "userAddress",column = "address"),
            @Result(property = "userSex",column = "sex"),
            @Result(property = "userBirthday",column = "birthday"),
            @Result(property = "accounts",column = "id",one = @One(select = "com.wang.dao.AccountDao.findByUid",fetchType = FetchType.LAZY))
    })
    List<User> findAll();

    @Select("select * from user where id=#{id}")
    @ResultMap("userMap")
    User findOne(Integer id);
}
