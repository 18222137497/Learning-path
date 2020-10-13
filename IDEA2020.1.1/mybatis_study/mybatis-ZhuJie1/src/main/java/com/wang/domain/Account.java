package com.wang.domain;

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable {
    private Integer accountId;
    private Integer accountUid;
    private Double accountMoney;

    private List<User> users;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountUid() {
        return accountUid;
    }

    public void setAccountUid(Integer accountUid) {
        this.accountUid = accountUid;
    }

    public Double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(Double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountUid=" + accountUid +
                ", accountMoney=" + accountMoney +
                '}';
    }
}
