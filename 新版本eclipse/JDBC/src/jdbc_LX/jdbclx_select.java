package jdbc_LX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * 查询day03.emp表的数据将其封装为对象，装载集合，然后打印
 * @author 123
 *
 */
public class jdbclx_select {
	public static void main(String[] args) {
		ArrayList<Emp> l=new ArrayList<Emp>();
			Connection con=null;
			Statement s=null;
			ResultSet r = null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.定义sql
			String sql="select * from emp";
			//3.获取数据库连接对象
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day03","root","root");
			//4.获取sql对象
			s=con.createStatement();
			//5.执行sql
			r = s.executeQuery(sql);
			//6.处理结果
			while (r.next()) {
				l.add(new Emp(r.getInt(1),r.getString(2),r.getString(3).toCharArray()[0],r.getDouble(4),r.getDate(5),r.getInt(6)));
			}
			for (Emp emp : l) {
				System.out.println(emp);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
