package com.wang.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
@Data
@NoArgsConstructor//无参
public class Emp implements Serializable {
    private Integer id;
    private String lastName;//姓
    private String email;
    private Integer gender;//0 男 1 女
    private Department department;
    private Date birth;

    public Emp(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }
}
