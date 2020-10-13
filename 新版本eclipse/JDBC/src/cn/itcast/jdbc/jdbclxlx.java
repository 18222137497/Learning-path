package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbclxlx {
	public static void main(String[] args) {
		Connection con =null;
		Statement s =null;
		ResultSet r =null;
		//1.注册驱动
		JDBCUtils j = new JDBCUtils();//注册驱动的代码在JDBCUtils工具类的静态代码块里，加载类时候一并加载了
		//2.定义sql
		String sql="select * from account";
		try {
		//3.获取数据库连接对象
		con = j.getConnection();
		//4.获取sql对象
		s = con.createStatement();
		//4.执行sql
		r = s.executeQuery(sql);
		while (r.next()) {
			System.out.println("id="+r.getInt(1)+"	name="+r.getString(2));
		}
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			JDBCUtils.close(s, con, r);
		}
		
	}
}
