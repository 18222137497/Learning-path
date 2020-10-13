package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_resultset {
	public static void main(String[] args) {
		Connection con=null;
		Statement s=null;
		ResultSet r =null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.定义sql
			String sql="select * from account";
			//3.获取Connection(数据库链接)对象
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/day04","root", "root");
			//4.获取sql对象
			s=con.createStatement();
			//5.执行sql
			 r = s.executeQuery(sql);
			//6.处理结果
			//6.1 让游标向下移动一行
			 //6.2 获取数据
			 while(r.next()) {
				int id = r.getInt(1);
				String name = r.getString("name");
				double balance = r.getDouble(3);
				System.out.println("id="+id+";name="+name+";balance="+balance);
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//7.释放资源
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (s!=null) {
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (r!=null) {
				try {
					r.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
