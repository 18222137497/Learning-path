package com.wang.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wang.DemoApplication;
import com.wang.Mapper.StudentMapper;
import com.wang.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class redisTest {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;//redis执行类
    @Autowired
    private ObjectMapper objectMapper;//对象转json字符串用的类
    @Test
    public void testRedis() throws JsonProcessingException {
        //1.从redis中获取数据，数据形式是json字符串
        String student = redisTemplate.boundValueOps("student").get();
        //2.判断redis中是否存在数据
        if (student==null){
            //没有缓存从数据库中查找
            List<Student> all = studentMapper.findAll();
            //将查找出来的对象转换成json格式
            student = objectMapper.writeValueAsString(all);
            //将转换成json格式的对象存入redis中，key为student
            redisTemplate.boundValueOps("student").set(student);
            System.out.println("从数据库中查找");
        }else {
            System.out.println("从缓存中查找");
        }
        System.out.println(student);
    }
}
