package com.wang.springConfig;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;
@Configuration
public class jdbcConfig {
    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${name}")//这里应该时容器里面的id冲突了，改成username会获得123这个值
    private String username;
    @Value("${password}")
    private String password;

    @Bean("properties")
    public Properties getProperties() throws IOException {
        Properties properties=new Properties();
        properties.put("driver",driver);
        properties.put("url",url);
        properties.put("username",username);
        properties.put("password",password);
        return properties;
    }
    @Bean("dataSource")
    public static DataSource getDateSource(Properties properties) throws Exception {
        return DruidDataSourceFactory.createDataSource(properties);
    }
    @Bean("jdbcTemplate")
    @Scope("prototype")
    public JdbcTemplate getTemplate(@Qualifier("dataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
