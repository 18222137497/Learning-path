package cn.itcast.jdbc;

import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * JDBC工具类
 * @author 123
 *
 */
public class JDBCUtils {
	private static String url;
	private static String user;
	private static String password;
	private static String driver;
	public static boolean login(String user,String password) {
		if (user==null||password==null) {
			return false;
		}
		Connection c=null; 
		PreparedStatement p=null;//预编译sql，他的父类是静态sql
		ResultSet r=null;
		try{
			String sql="select * from user where username = ? and password = ?";//?是占位符
			//1.获取Connection对象
			c=JDBCUtils.getConnection();
			//2.获取执行sql语句的对象 PreparedStatement
			p = c.prepareStatement(sql);
			//3.给?赋值
			p.setString(1, user);//参数1:第几个问号,参数2:给这个问号赋的值
			p.setString(2, password);
			//4.执行sql
			r=p.executeQuery();
			return r.next();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtils.close(p, c, r);
		}
		return false;
	}
	/**
	 * 文件的读取，只需呀读取一次即可拿到这些值，只用静态代码块(优化！静态代码块会在类被调用时一并加载)
	 */
	static {
		try {
			//1.创建Properties集合类
			Properties p = new Properties();
			//2.获取src路径下的文件的方式--->ClassLoader类加载器
			ClassLoader cl = JDBCUtils.class.getClassLoader();
			URL u = cl.getResource("jdbc.properties");//获取Resource资源，URL统一资源标识符，定位文件绝对路径
			String path=u.getPath();//获取字符串路径
			p.load(new FileReader(path));//加载文件
			//3.获取数据，赋值
			url=p.getProperty("url");
			user=p.getProperty("user");
			password=p.getProperty("password");
			driver=p.getProperty("driver");
			//4.注册驱动
			Class.forName(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取连接对象
	 * @return 数据库连接对象
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,user,password);
	}
	/**
	 * 释放资源
	 * @param s	
	 * @param c
	 */
	public static void close(Statement s,Connection c) {
		if (s!=null) {
			try {
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (c!=null) {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Statement s,Connection c,ResultSet r) {
		if (s!=null) {
			try {
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (c!=null) {
			try {
				c.close();
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
