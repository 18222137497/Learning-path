package com.wang.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ojdbc {
    public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //获得连接对象
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "itheima", "itheima");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from person");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int anInt = resultSet.getInt("pid");
            String string = resultSet.getString("pname");
            String string1 = resultSet.getString("sex");
            System.out.println(anInt+" "+string+" "+string1);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
