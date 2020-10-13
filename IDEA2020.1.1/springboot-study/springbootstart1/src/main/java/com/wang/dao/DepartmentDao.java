package com.wang.dao;

import com.wang.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//部门dao
@Repository
public class DepartmentDao {
    //模拟数据库中的数据
    private static Map<Integer, Department> departmentMap =null;
    static {
        departmentMap=new HashMap<Integer, Department>();
        departmentMap.put(101,new Department(101,"教学部"));
        departmentMap.put(102,new Department(102,"市场部"));
        departmentMap.put(103,new Department(103,"教研部"));
        departmentMap.put(104,new Department(104,"运营部"));
        departmentMap.put(105,new Department(105,"后勤部"));
    }
    //查询所有部门方法，不包含编号
    public Collection<Department> findAllDepartment(){
        return departmentMap.values();//返回map集合的Collection视图
    }
    //添加方法
    public void addDepartment(Department department){
        departmentMap.put(department.getId(),department);
    }
    //根据id删除部门
    public void deleteDepartment(Integer id){
        departmentMap.remove(id);
    }
    //根据id查找部门
    public Department findDepartment(Integer id){
        Department department = departmentMap.get(id);
        return department;
    }
}
