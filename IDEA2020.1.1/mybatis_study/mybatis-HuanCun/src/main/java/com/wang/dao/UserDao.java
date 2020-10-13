package com.wang.dao;


import com.wang.domain.User;

import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 *
 * 用户的持久层接口
 */
public interface UserDao {

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> findAll();
    /**
     * 查找一个
     */
    User findOne(Integer id);
}
