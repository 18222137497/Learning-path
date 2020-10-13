package com.wang.jdbc;

import java.sql.*;

public class JdbcDemo1 {
    public static void main(String[] args) throws SQLException {
        //注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","root");
        //获取操作数据库的预处理对象
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account");
        //执行sql，得到结果集
        ResultSet resultSet = preparedStatement.executeQuery();
        //遍历结果集
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        //释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
