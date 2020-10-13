package com.wang.utils;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * 处理异常业务逻辑
     * @param request
     * @param response
     * @param handler 当前处理器对象，一般不用
     * @param ex 捕获的异常对象
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //获取到异常对象
        SysException sysException=null;
        if (ex instanceof SysException){
            sysException=(SysException) ex;
        }else {
            sysException=new SysException("系统正在维护");
        }
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMsg",ex.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
