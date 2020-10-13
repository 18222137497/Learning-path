package druid;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


/**
 * Druid的工具类
 * @author 123
 *
 */
public class DruidUtils {
	private static DataSource d;
	/**
	 * 静态代码块记载文件
	 */
	static {
		try {
			Properties p=new Properties();
			p.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			new DruidDataSourceFactory();
			d= DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @return 获取的数据库连接对象
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return d.getConnection();
	}
	/**
	 * 关闭流的方法
	 * @param c
	 * @param s
	 * @param r
	 */
	public static void closs(Connection c,Statement s,ResultSet r) {
		if (c!=null) {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (s!=null) {
			try {
				s.close();//归还连接
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
	/**
	 * 获取数据库连接池的方法
	 * @return	数据库连接池对象
	 */
	public static DataSource getDruidDataSource() {
		return d;
	}
	
}
