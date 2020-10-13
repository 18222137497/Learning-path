package com.wang.domain;

import java.util.Date;

public class Aa {
    private Date date;
    private Home home;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Aa{" +
                "date=" + date +
                ", home=" + home +
                '}';
    }
}
