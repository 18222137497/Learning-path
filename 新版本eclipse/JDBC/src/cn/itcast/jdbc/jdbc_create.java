package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_create {
	public static void main(String[] args) {
			Connection con=null;
			Statement s=null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.定义sql
			String sql ="create table student(id int,name varchar(20))";
			//3.获取Connection数据库连接对象
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/day04","root","root");
			//4.获取sql对象 Statement
			s=con.createStatement();
			//5.执行sql
			int e = s.executeUpdate(sql);
			//6.处理结果
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//7.释放资源
			if (s!=null) {
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
