package com.mysqllx;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


/**
 * π§æﬂ¿‡
 * @author 123
 *
 */
public class MysqlUtils {
	private static DataSource d; 
	static {
		try {
			Properties p=new Properties();
			p.load(MysqlUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			d = DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		return d.getConnection();
	}
	public static DataSource getDataSource() {
		return d;
	}
	public static void cloes(Connection c,ResultSet r,Statement s) {
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
		if (s!=null) {
			try {
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
