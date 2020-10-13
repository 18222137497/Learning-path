package com.wang.dao;

import com.wang.domain.Account;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
//开启二级缓存
@Repository
@CacheNamespace(blocking = true)
public interface AccountDao {
    void find();
    @Select("select * from account")
    List<Account> findAll();
}
