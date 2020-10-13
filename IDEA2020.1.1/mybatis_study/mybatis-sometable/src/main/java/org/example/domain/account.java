package org.example.domain;

public class account {
    private Integer id;
    private Integer uid;
    private Double money;

    //从表实体应该包含一个主表实体的引用对象
    private IUser iUser;

    public IUser getiUser() {
        return iUser;
    }

    public void setiUser(IUser iUser) {
        this.iUser = iUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", user=" + iUser +
                '}';
    }
}