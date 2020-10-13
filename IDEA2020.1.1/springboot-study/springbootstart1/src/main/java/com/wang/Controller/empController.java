package com.wang.Controller;

import com.wang.dao.EmpDao;
import com.wang.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class empController {
    @Autowired
    private EmpDao empDao;
    @RequestMapping("empList")
    public String list(Model model){
        Collection<Emp> allEmp = empDao.findAllEmp();
        model.addAttribute("emps",allEmp);
        return "list";
    }
    @RequestMapping("updateEmp/{id}")
    public String updateEmp(@PathVariable String id){//Restful风格，但是从浏览器传来的都是字符串类型的，需要自己转型
        empDao.deleteEmp(Integer.parseInt(id));//这里没设置事务
        return "redirect:/empList";//坑，需要加/
    }
}
