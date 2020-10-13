package com.wang.servlet;

import com.wang.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/servlet")
public class servlet {
    @RequestMapping("testString")
    public String testString(){
        System.out.println("一般通过返回值和视图解析器响应页面");
        return "succeed";
    }
    @RequestMapping("testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("没有返回值响应页面");
        //转发
//        request.getRequestDispatcher("/WEB-INF/pages/succeed.jsp").forward(request,response);//这里一旦使用了servlet对象就不能使用视图解析器，要写完整的uri
//        response.sendRedirect("/WEB-INF/pages/succeed.jsp");//todo 重定向到页面 这个测试失败，估计要写完整的url
//        response.sendRedirect("testVoid");//todo 重定向到servlet，这个是可行的
//        //也可以通过response指定响应结果，例如响应json数据
        response.setCharacterEncoding("utf-8");//设置响应对象编码
        response.setContentType("application/json;charset=utf-8");//设置响应头信息
        response.getWriter().write("json串");//写入到网页中  todo 地址栏里的值为：http://localhost/springmvc-response/servlet/testVoid
    }
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView=new ModelAndView();//todo 需要细细研究
        modelAndView.addObject("username","张三");//往request域中传入一对数据
        modelAndView.setViewName("succeed");//设置转发的对象，这里用了视图解析器
        System.out.println("通过比较提层的ModelAndView响应对象");
        return modelAndView;
    }
    @RequestMapping("testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("使用Forward或Redirect关键字转发或者重定向");
//        return "forward:/WEB-INF/pages/succeed.jsp";   //转发
        return "redirect:http://localhost/springmvc-response/servlet/testString";  //重定向 和上面那个重定向一样，跳转网页也完整的url
    }
    @RequestMapping(value = "/testAjax",method = RequestMethod.POST)
    public @ResponseBody Account testAjax(@RequestBody Account account){
        System.out.println("执行了异步传输");
        System.out.println(account);
        account.setMoney(1000f);
        return account;
    }
}
