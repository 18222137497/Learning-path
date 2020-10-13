package Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;


/**
 * Druid数据库连接池工具类
 * @author 123
 *
 */
public abstract class DruidUtils {
	private static DataSource d;
	static {
		try {
			Properties p=new Properties();
			p.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			new com.alibaba.druid.pool.DruidDataSourceFactory();
			d = com.alibaba.druid.pool.DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 从数据库连接池里获取数据库连接对象
	 * @return 数据库连接对象
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return d.getConnection();
	}
	/**
	 * 获取数据库连接池
	 * @return 数据库连接池
	 */
	public static DataSource getDataSource() {
		return d;
	}
	
	/**
	 * 释放资源的方法
	 * @param c 数据库连接对象
	 * @param s 数据库执行对象
	 * @param r	结果集
	 */
	public static void cloes(Connection c,Statement s,ResultSet r)  {
		if (c!=null) {
			try {
				c.close();
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
	abstract void bookSelect();//查询图书馆书籍
    abstract void userSelect(int i);//查询用户收藏书籍
	abstract void addUserBook();//给用户收藏夹增加一本书
	abstract void subUserBook();//给用户收藏夹删除一本书
	abstract void alterUserPassword();//修改密码
	abstract void createUser();//创建用户
	abstract void loginUser();//用户登录
	abstract void updateUserName();//修改用户名称
}