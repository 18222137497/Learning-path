package com.wang.dao.Impl;

import com.wang.dao.AccountDao;
import com.wang.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
    @Override
    public List<Account> findAllAccount() {
        return super.getJdbcTemplate().query("select * from account",new BeanPropertyRowMapper<Account>(Account.class));
    }

    @Override
    public Account findAccountById(Integer id) {
        return super.getJdbcTemplate().queryForObject("select * from account where id=?",new BeanPropertyRowMapper<Account>(Account.class),id);
    }

    @Override
    public void saveAccount(Account account) {
        super.getJdbcTemplate().update("insert into account values(?,?,?)",account.getId(),account.getName(),account.getMoney());
    }

    @Override
    public void updateAccount(Account account) {
        super.getJdbcTemplate().update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public void deleteAccountById(Integer id) {
        super.getJdbcTemplate().update("delete from account where id=?",id);
    }

    @Override
    public Account findAccountByName(String name) {
        return super.getJdbcTemplate().queryForObject("select * from account where name = ?",new BeanPropertyRowMapper<Account>(Account.class),name);
    }
}
