package com.wang.Controller;

import com.wang.Mapper.StudentMapper;
import com.wang.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class test {
    @Autowired
    private StudentMapper studentMapper;
    @RequestMapping("/test")
    @ResponseBody
    public List<Student> test(){
        List<Student> all = studentMapper.findAll();
        return all;
    }
}
