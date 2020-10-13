package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 练习: account表 删除一条记录 delete
 * @author 123
 *
 */
public class jdbc_delete {
	public static void main(String[] args) {
		Connection con = null;
		Statement s =null;
		try {
		//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
		//2.定义sql语句
			String sql="delete from account where id=3";
		//3.获取Connection数据库连接对象
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day04", "root", "root");
		//4.获取sql对象
			s = con.createStatement();
		//5.执行sql语句
			int e = s.executeUpdate(sql);
		//6.处理结果
			System.out.println(e);
			if (e>0) {
				System.out.println("执行成功");
			}else {
				System.out.println("执行失败");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
