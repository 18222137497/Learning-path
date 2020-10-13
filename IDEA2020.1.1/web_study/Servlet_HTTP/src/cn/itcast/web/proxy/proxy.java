package cn.itcast.web.proxy;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@WebFilter("/*")
public class proxy implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        Lenovo lenovo = new Lenovo();//创建真实对象
        //创建代理对象
        /*
            Proxy是long包下的
            参数：
                1.真实对象的类加载器
                2.真实对象实现的所有接口数值   lenovo.class.geiInterface()
                3.处理器  new InvocationHandler()
         */
        saleCompute proxy_saleCompute =(saleCompute) Proxy.newProxyInstance(Lenovo.class.getClassLoader(), Lenovo.class.getInterfaces(), new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象
             * @param method 方法对象
             * @param args 参数列表对象
             * @return 代理对象的此方法的返回值
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {//处理器接口中的一个抽象方法
                if (method.getName().equals("sale")) {//判断方法名字是否为sale
                    args[0] = (double) args[0] * 0.90;//增强参数列表(操作参数列表)
                    System.out.println("代理商购买");
                    //用真实对象调用这个sale方法，参数为真实对象和修改过的参数列表，返回值为真实对象的这个方法的返回值
                    String invoke = (String) method.invoke(lenovo, args[0]);
                    //增强返回值，这里的返回值是代理对象的返回值
                    return "买了一个" + invoke + "元的电脑,送你一个鼻屎";
                } else {
                    Object invoke = method.invoke(lenovo, args);
                    return invoke;
                }
            }
        });
        chain.doFilter(req, resp);

    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {

    }

}
