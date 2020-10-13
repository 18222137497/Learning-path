package com.wang.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class testController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("test")
    public List<Map<String,Object>> findAl(){
        return jdbcTemplate.queryForList("select * from user");
    }
}
