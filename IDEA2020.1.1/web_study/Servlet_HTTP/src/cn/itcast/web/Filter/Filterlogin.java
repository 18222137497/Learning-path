package cn.itcast.web.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Filterlogin implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //0.强制转换
        HttpServletRequest request=(HttpServletRequest)req;
        //1.获取资源请求路径
        String requestURI = request.getRequestURI();
        //2.判断是否包含登录相关资源路径，要注意排除掉css/js/图片/验证码/等资源
        if (requestURI.contains("login.jsp")||requestURI.contains("/loginServlet")||requestURI.contains("/cs/")||requestURI.contains("/js/")||requestURI.contains("/fonts/")||requestURI.contains("/checkCodeServlet")){
            //包含，用户想登录，放行
            chain.doFilter(req,resp);
        }else {
            //不包含，需要验证用户是否登录
            //3.从获取session中获取user
            Object user = request.getSession().getAttribute("user");
            if (user!=null){
                //登录了，放行
                chain.doFilter(req,resp);
            }else {
                //没有登录
                request.setAttribute("cc_error","请先登录");
                request.getRequestDispatcher("/login.jsp").forward(request,resp);
            }
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {

    }

}
