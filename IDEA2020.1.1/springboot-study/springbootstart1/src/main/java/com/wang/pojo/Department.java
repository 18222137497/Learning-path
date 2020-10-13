package com.wang.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
@Data
@AllArgsConstructor//有参
@NoArgsConstructor//无参
public class Department implements Serializable {
    private Integer id;
    private String departmentName;



}

