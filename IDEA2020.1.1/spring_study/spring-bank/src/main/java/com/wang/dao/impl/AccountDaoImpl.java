package com.wang.dao.impl;

import com.wang.dao.AccountDao;
import com.wang.domian.Account;
import com.wang.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private QueryRunner runner;
    private ConnectionUtils connectionUtils;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    @Override
    public List<Account> findAllAccount() {
        String sql="select * from account";
        try{
            return runner.query(connectionUtils.getThreadConnection(),sql,new BeanListHandler<Account>(Account.class));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account findAccountBuId(Integer id) {
        String sql="select * from account where id=?";
        try{
            return runner.query(connectionUtils.getThreadConnection(),sql,new BeanHandler<Account>(Account.class),id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveAccount(Account account) {
        String sql="insert into account values(?,?,?)";
        try{
            runner.update(connectionUtils.getThreadConnection(),sql,account.getName(),account.getMoney());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account account) {
        String sql="update account set name=?,money=? where id=?";
        try{
            runner.update(connectionUtils.getThreadConnection(),sql,account.getName(),account.getMoney(),account.getId());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAccountById(Integer id) {
        String sql="delete from account where id=?";
        try{
            runner.update(connectionUtils.getThreadConnection(),sql,id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account findAccountByName(String name) {
        String sql="select * from account where name=?";
        try{
            List<Account> accounts = runner.query(connectionUtils.getThreadConnection(),sql,new BeanListHandler<Account>(Account.class),name);
            if(accounts == null || accounts.size() == 0){
                return null;
            }
            if(accounts.size() > 1){
                throw new RuntimeException("结果集不唯一，数据有问题");
            }
            return accounts.get(0);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
