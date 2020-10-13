package com.wang.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Student implements Serializable {
    private String name;
    private List<String> like;
    private Map<String,String> family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLike() {
        return like;
    }

    public void setLike(List<String> like) {
        this.like = like;
    }

    public Map<String, String> getFamily() {
        return family;
    }

    public void setFamily(Map<String, String> family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "student{" +
                "names='" + name + '\'' +
                ", like=" + like +
                ", family=" + family +
                '}';
    }
}
