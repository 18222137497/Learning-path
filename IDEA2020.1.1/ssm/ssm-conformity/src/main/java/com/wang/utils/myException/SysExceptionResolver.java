package com.wang.utils.myException;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        SysException sysException=null;
        if (ex instanceof SysException){
            sysException=(SysException)ex;
        }else {
            sysException=new SysException("系统繁忙");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMsg",sysException.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
