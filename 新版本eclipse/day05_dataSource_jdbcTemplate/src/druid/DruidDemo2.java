package druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Druid工具类的测试类
 * @author 123
 *
 */
public class DruidDemo2 {
	public static void main(String[] args) {
		Connection c = null;
		PreparedStatement s =null;
		ResultSet r=null;
		try {
		//1.注册驱动
		new DruidUtils();
		//2.定义sql
		String sql = "select * from account where id=?";
		//3.获取连接池对象
		c = DruidUtils.getConnection();
		//4.获取执行sql对象
		s = c.prepareStatement(sql);
		s.setInt(1, 1);
		//5.执行sql
		r = s.executeQuery();
		while (r.next()) {
			System.out.print("id="+r.getInt(1)+"|name="+r.getString(2)+"|balance="+r.getInt(3));
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DruidUtils.closs(c, s, r);
		}
		
	}
}
