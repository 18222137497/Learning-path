package c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * c3p0演示
 * @author 123
 *
 */
public class C3P0Demo1 {
	public static void main(String[] args) throws SQLException {
		/*
		 * 1.导包(两个) c3p0-0.9.5.2.jar mchange-commons-java-0.2.12.jar ，
		 *不要忘记导入数据库驱动jar包
		 */
		/*
		 * 2.设置配置文件
		 * 名称： c3p0.properties 或者 c3p0-config.xml
		 * 路径：直接将文件放在src目录下即可。
		 */
		//3.创建数据库连接池对象
		DataSource ds=new ComboPooledDataSource();//这里可以传个参数String类型传的是named-config name="otherc3p0"
		//4.获取连接对象
		Connection con = ds.getConnection();
		System.out.println(con);
		
	}
}
