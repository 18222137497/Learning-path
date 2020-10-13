package com.wang.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@EnableWebSecurity//要加这个注解，官方说的
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人可以访问,功能页需要权限访问
        //请求授权的规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/index").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");
        //没有权限默认去登录页面,需要开启登录的页面
        http.formLogin()
                .loginPage("/toLogin")//指定登录页面
//                .usernameParameter("user")设置提交username的key的别名，没设置的话提交username的表单name必须是username
//                .passwordParameter("pwd")设置提交password的key的别名，没设置的话提交password的表单name必须是password
//                .loginProcessingUrl("/login")设置跳转的路径别名，没有设置就必须和loginPage(“页面”)中页面的路径一样
        ;
        //开启注销
        http.logout()
                .logoutSuccessUrl("/");//注销成功挑战那个页面
        //防止网站工具 ： get post
        http.csrf().disable();//关闭csrf，默认是开启的

        //开启记住我功能 cookie 默认保存两周
        http.rememberMe()
            .rememberMeParameter("remember")//设置记住我的name的别名
        ;
    }
    //认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //这些数据正常应该在数据库中取
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())//色绘制加密方式，目前是官方推荐的加密方式
                .withUser("18222137497@163.com").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3")
                .and()
                .withUser("252587065").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1");
    }
}
