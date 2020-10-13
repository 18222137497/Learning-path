package com.wang.dao;

import com.wang.domain.Account;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
/*CacheNamespace 开启二级缓存，这个blocking的默认值是false，需要改成true该类才能使用二级缓存*/
@CacheNamespace(blocking = true)
public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    @Results(id = "accountMap",value = {
            @Result(id = true,property = "accountId",column = "id"),
            @Result(property = "accountUid",column = "uid"),
            @Result(property = "accountMoney",column = "money"),
            @Result(property = "users",column = "uid",one = @One(select = "com.wang.dao.UserDao.findOne",fetchType = FetchType.LAZY))
    })
    List<Account> findAll();

    /**
     * 根据uid查询Account
     * @param uid
     * @return
     */
    @Select("select * from account where uid=#{uid}")
    @Results(id = "account",value ={
            @Result(id = true,property = "accountId",column = "id"),
            @Result(property = "accountUid",column = "uid"),
            @Result(property = "accountMoney",column = "money")
    } )
    List<Account> findByUid(Integer uid);
}
