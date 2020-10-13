package cn.itcast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private  static DataSource d;
    static {
        Properties p = new Properties();
        try {
            p.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            d=DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return d;
    }
    public static Connection getConnection() throws SQLException {
        return d.getConnection();
    }
    public static void close(Connection c, Statement s, ResultSet r){
        if (c != null) {
            try {
                c.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (s != null) {
            try {
                s.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (r != null) {
            try {
                r.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
