package com.wang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * 自定义mvc配置类
 *  试图全面扩展mvc配置
 * 如果我们要扩展springmvc，官方推荐我们这样做
 */
@Configuration//变成配置类，配置类一开始就运行，并不等于@Bean标签，@Bean标签相当于添加组件
//@EnableWebMvc //全面接管mvc，让springboot的mvc部分自动配置全部失效，等于自己重写
//上面这个注解就是给该类，导入了一个DelegatingWebMvcConfiguration类，这个类继承WebMvcConfigurationSupport，
//源码中显示带有这个类继承WebMvcConfigurationSupport会使自动配置失效
public class MyMVCConfig implements WebMvcConfigurer {//实现接口

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {//配置视图控制器
        //这里因为修改了默认访问根路径，所以访问路径变成了http://localhost/wang/wang
        //registry.addViewController("/wang").setViewName("test");//我们访问/wang就会跳转test页面
        //如果urlPath填的是/那就是指定首页了！！！！！！
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/top").setViewName("top");

    }
    //讲自定义国际化组件放入ioc容器中让springboot识别
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())//添加自定义拦截器
                .addPathPatterns("/**")//设置拦截的范围
                .excludePathPatterns("/index.html","/","/index","/login","/css/*","/js/*","/fonts/*");//设置不拦截的
    }
    //    //ViewResolver 实现了视图解析器接口的类，我们就可以把它看作是视图解析器
//    @Bean
//    public ViewResolver myViewResolver(){
//        return new MyViewResolver();
//    }
//    //使用静态内部类自定义一个自己的视图解析器
//    public static class MyViewResolver implements ViewResolver{//实现接口
//        @Override
//        public View resolveViewName(String s, Locale locale) throws Exception {
//            return null;
//        }
//    }

}
