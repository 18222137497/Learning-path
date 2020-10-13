package com.wang.dao.impl;

import com.wang.dao.AccountDao;
import com.wang.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Account> findAll() {
        List<Account> query = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        return query;
    }

    @Override
    public Account findOne(Integer id) {
        Account account = jdbcTemplate.queryForObject("select * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class), id);
        return account;
    }

    @Override
    public void addOne(Account account) {
        int update = jdbcTemplate.update("insert into account(name,money) values(?,?)",account.getName(),account.getMoney());
        if (update==0){
            System.out.println("添加失败");
        }else {
            System.out.println("添加成功");
        }
    }

    @Override
    public void deleteOne(Integer id) {
        int update = jdbcTemplate.update("delete from account where id=?", id);
        if (update==0){
            System.out.println("删除失败");
        }else {
            System.out.println("删除成功");
        }
    }

    @Override
    public void updateOne(Account account) {
        int update = jdbcTemplate.update("update account set name=? money=? where id=?", account.getName(), account.getMoney(), account.getId());
        if (update==0){
            System.out.println("添加失败");
        }else {
            System.out.println("添加成功");
        }
    }
}
