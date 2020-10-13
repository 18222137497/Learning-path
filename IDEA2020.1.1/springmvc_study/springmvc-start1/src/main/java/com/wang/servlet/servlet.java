package com.wang.servlet;

import com.wang.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import sun.jvm.hotspot.tools.soql.SOQL;
import sun.nio.cs.UTF_8;

import java.io.UnsupportedEncodingException;
import java.sql.Time;
import java.util.Date;
import java.util.Map;
import java.util.Timer;

@Controller
@RequestMapping("/servlet")
@SessionAttributes({"msg"})  //将request里的msg对象存入到session域中
public class servlet {
    @ModelAttribute    //ModelAttribute注解标记的方法，会在执行一下的任何方法执行之前执行一次
    public void top1(Map<String,User> map){ //没有返回值得话就需要将要存的对象放到一个map集合中(让后springmvc会将这个map存到内部的ModelMap一个LinkedHashMap中)
        User user=new User();
        user.setId(1);
        user.setName("我字节我");
        user.setDate(new Date(12351284));
        map.put("a",user);
    }
    @ModelAttribute
    public User top(){ //有返回值就会将返回值放入Model中，键名不确定！！！！
        User user=new User();
        user.setId(1);
        user.setName("我自己");
        user.setDate(new Date());
        return user;
    }
    @RequestMapping("/testRequestParam")   //获取请求值，意思就是防止标签中的name属性名和参数名不一致导致的传入错误问题，这个注解的作用就类似于牵线
    public String testRequestParam(@RequestParam("name") String username){
        System.out.println(username);
        return "succeed";
    }
    @RequestMapping(value = "/testRequestBody",method = RequestMethod.POST)
    public String testRequestBody(@RequestBody String arr) throws UnsupportedEncodingException {//RequestBody注解是获取请求体，只有post方法有请求体！！
        //@RequestBody不适用于get，因为get没有请求体
        System.out.println(arr);
        return "succeed";
    }
    @RequestMapping("/{id}")
    public String testPathVariable(@PathVariable("id")String UID){//这个是REST风格编程，个人感觉没什么用，意思就是请求servlet/10的时候，这个10可以被获取并且赋值给参数对象
        System.out.println(UID);   //该风格的优点就是内存存放统一，便于处理
        return "succeed";
    }
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String h){//获取指定的请求头参数并赋值给方法参数对象
        System.out.println("Accept"+h);
        return "succeed";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String c){//获取指定名称的Cookie对象的值
        System.out.println("JSESSIONID"+c);
        return "succeed";
    }

    @RequestMapping("/testModelAttribute")
    public String testRequestMapping(User user){ //和ModelAttribute对象合用，这个参数会被赋值(上面那个有返回值的方法的返回值就赋值给这个参数对象了)
        System.out.println(user);
        return "succeed";
    }
    @RequestMapping("/testModelAttribute1")
    public String testRequestMapping1(@ModelAttribute("a") User user){ //获取ModelMap中指定key的对象或者值
        System.out.println(user);
        return "succeed";
    }

    /**
     * 添加session
     * @param map
     * @return
     */
    @RequestMapping("/testSessionAttributesSetSession")
    public String testRequestMappingSetSession(ModelMap map){
        map.addAttribute("msg","红鸟");//这里其实是将这一个键值对放入request域中，并不是直接放到session
         return "succeed";
    }

    /**
     * 获得session
     * @param map
     * @return
     */
    @RequestMapping("/testSessionAttributesGetSession")
    public String testRequestMappingGetSession(ModelMap map){
        String msg =(String) map.getAttribute("msg");
        System.out.println(msg);
        return "session";
    }

    /**
     * 删除session
     * @param status
     * @return
     */
    @RequestMapping("/testSessionAttributesRemoveSession")
    public String testRequestMappingRemoveSession(SessionStatus status){ //
        status.setComplete();//设置完成，表示已经完成传输，清空session域
        return "succeed";
    }

}
