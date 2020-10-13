package org.example.dao;

import org.example.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查找所有
     * @return
     */
    List<User> findAll();

    /**
     * 添加用户
     * @param user
     */
    void saveUser(User user);
}
