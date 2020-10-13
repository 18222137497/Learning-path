package org.example.dao;

import org.example.domain.QueryVo;
import org.example.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查找所有
     */
    List<User> findAll();

    /**
     * 添加用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 根据传入参数条件
     * @param user 查询的条件：有可能有用户名，有可能有性别，也有可能有地址，还有可能是都有
     * @return
     */
    List<User> findUserByCondition(User user);

    /**
     * 根据queryvo中提供的id集合，查询用户信息
     * @param queryVo
     * @return
     */
    List<User> findUserInIds(QueryVo queryVo);
}
