package com.wang.dao;

import com.wang.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查找所有user
     * @return
     */
    List<User> findAll();

    /**
     * 延迟加载查询User
     * @return
     */
    List<User>findAll1();
    /**
     * 根据id查找user
      * @param id
     * @return
     */
    User findOne(Integer id);
}
