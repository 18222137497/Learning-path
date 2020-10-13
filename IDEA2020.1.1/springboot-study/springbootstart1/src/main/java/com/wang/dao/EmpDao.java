package com.wang.dao;

import com.wang.pojo.Department;
import com.wang.pojo.Emp;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository

public class EmpDao {
    private static Map<Integer, Emp> empMap=null;
    @Autowired
    private Department department;
    static {//快捷键：alt+鼠标选中！！！！！
            empMap=new HashMap<Integer, Emp>();
            empMap.put(1001,new Emp(1001,"A","252587060@qq.com",1,new Department(101,"教学部")));
            empMap.put(1002,new Emp(1002,"B","252587061@qq.com",0,new Department(102,"市场部")));
            empMap.put(1003,new Emp(1003,"C","252587062@qq.com",1,new Department(103,"教研部")));
            empMap.put(1004,new Emp(1004,"D","252587063@qq.com",0,new Department(104,"运营部")));
            empMap.put(1005,new Emp(1005,"E","252587064@qq.com",1,new Department(105,"后勤部")));
    }
    //查询所有员工的方法
    public Collection<Emp> findAllEmp(){
        return empMap.values();
    }
    public void addEmp(Emp emp){
        empMap.put(emp.getId(),emp);
    }
    public void deleteEmp(Integer id){
        empMap.remove(id);
    }
    public Emp findEmpById(Integer id){
        return empMap.get(id);
    }
}
