package org.example.dao;


import org.example.domain.IUser;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有,同时获取到用户下所有账户的信息
     * @return
     */
    List<IUser> findAll();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    List<IUser> findById(int id);
}
