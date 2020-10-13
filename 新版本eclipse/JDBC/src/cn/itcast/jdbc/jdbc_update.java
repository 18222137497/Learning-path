package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 练习: account表 修改一条记录 update
 * @author 123
 *
 */
public class jdbc_update {
	public static void main(String[] args) {
		Connection con = null;
		Statement se = null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.定义sql
			String sql="update account set balance=1000 where id=2";
			//3.获取Connection(数据库连接对象)对象
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day04", "root", "root");
			//4.获取sql对象
			se = con.createStatement();
			//5.执行sql
			int ex = se.executeUpdate(sql);
			//6.处理结构
			System.out.println(ex);
			if (ex>0) {
				System.out.println("执行成功");
			}else {
				System.out.println("执行失败");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//7.释放资源
			if (se!=null) {
				try {
					se.close();
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
