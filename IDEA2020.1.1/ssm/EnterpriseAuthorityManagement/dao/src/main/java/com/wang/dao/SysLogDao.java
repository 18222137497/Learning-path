package com.wang.dao;

import com.wang.domain.Syslog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 日志dao
 */
@Repository
public interface SysLogDao {
    /**
     * 添加日志
     * @param syslog
     * @throws Exception
     */
    @Insert("insert into syslog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void save(Syslog syslog) throws Exception;

    /**
     * 查询所有日志信息
     * @return
     * @throws Exception
     */
    @Select("select * from syslog")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "visitTime",column = "visitTime"),
            @Result(property = "username",column = "username"),
            @Result(property = "ip",column = "ip"),
            @Result(property = "url",column = "url"),
            @Result(property = "executionTime",column = "executionTime"),
            @Result(property = "method",column = "method")
    })
    List<Syslog> findAll() throws Exception;
}
