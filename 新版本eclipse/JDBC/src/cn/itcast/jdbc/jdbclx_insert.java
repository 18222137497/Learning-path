package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1.练习: account表 添加一条记录 insert
 * @author 123
 *
 */

public class jdbclx_insert {
	public static void main(String[] args) {
		Connection con=null;
		Statement cs =null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.定义sql
			String sql = "insert into account values(null,'wangwu',3000)";
			//3.获取Connection
			con = DriverManager.getConnection("jdbc:mysql:///day04", "root", "root");
			//4.获取执行sql对象
			cs = con.createStatement();
			//5.执行sql
			int ex = cs.executeUpdate(sql);
			//6.处理结果
			System.out.println(ex);
			if (ex>0) {
				System.out.println("添加成功");
			}else {
				System.out.println("添加失败");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//7.释放资源
			if (cs!=null) {
				try {
					cs.close();
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
