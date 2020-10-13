package com.wang.demo;

import com.wang.Mapper.StudentMapper;
import com.wang.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    void contextLoads() {
        List<Student> all = studentMapper.findAll();
        System.out.println(all);
    }

}
