package c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 连接池参数验证
 * @author 123
 *
 */
public class C3P0Demo2 {
	public static void main(String[] args) throws SQLException {
		DataSource ds=new ComboPooledDataSource();
		/*
		 * 测试最大连接数量 和超时时间
		 */
		for (int i = 1; i < 11; i++) {
			Connection c = ds.getConnection();
			System.out.println(i+"	"+c);
			if(i==5) {
				c.close();
			}
		}
		ds.getConnection();
	}
}
