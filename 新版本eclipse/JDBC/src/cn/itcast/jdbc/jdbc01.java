package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JBDC快速入门
 * @author 123
 *
 */
public class jdbc01 {
	public static void main(String[] args) throws Exception {
		//1.导入驱动架包
		//2.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//3.获取数据库的连接对象
		Connection connection = DriverManager.getConnection("jdbc01:mysql://localhost:3306/day04","root","root");
		//4.定义一个sql语句
		String sql="update account set balance = 500 where id=2";
		//5.获取执行sql对象 Statement
		Statement stmt = connection.createStatement();
		//6.执行sql
		int count = stmt.executeUpdate(sql);
		//7.处理结果
		System.out.println(count);
		//释放资源
		stmt.close();
		connection.close();
	}
}
