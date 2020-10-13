package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务
 * @author 123
 *
 */
public class jdbc_shiwu {
	public static void main(String[] args) {
		Connection c=null;
		PreparedStatement p1=null;
		PreparedStatement p2=null;
		try {
			//1.获取数据库连接对象
			c =JDBCUtils.getConnection();
			//2.开启事务
			c.setAutoCommit(false);
			//3.定义sql语句
			String sql1="update account set balance = balance - ? where id = ? ";
			String sql2="update account set balance = balance + ? where id = ? ";
			//4.获取sql执行对象
			p1=c.prepareStatement(sql1);
			p2=c.prepareStatement(sql2);
			p1.setDouble(1, 500);
			p1.setInt(2, 1);
			p2.setDouble(1, 500);
			p2.setInt(2, 2);
			//5.执行sql
			p1.executeUpdate();
			p2.executeUpdate();
			c.commit();//没有发生错误，提交事务
		} catch (Exception e) {//这里要抛大异常
			try {
				c.rollback();//发生错误，事务回滚
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			JDBCUtils.close(p1, c);
			JDBCUtils.close(p1, null);
		}
		
	}
}
