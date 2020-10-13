package org.apache.dao;

import org.apache.domain.User;
import org.apache.domain.ZZ;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新操作
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除功能
     * @param integer
     */
    void deleteUser(Integer integer);
    /**
     * 根据id查询用户信息
     */
    User selectUser(Integer id);
    /**
     * 模糊查询
     */
    List<User> findLikeUser(String s);
    /**
     * 查询总用户数
     */
    int findTotal();

    /**
     *  根据ZZ的条件查询用户
     * @return
     */
    List<User> findUserByZZ(ZZ z);
}
