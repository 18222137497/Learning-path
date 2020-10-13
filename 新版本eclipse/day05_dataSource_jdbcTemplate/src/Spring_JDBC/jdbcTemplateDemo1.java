package Spring_JDBC;

import org.springframework.jdbc.core.JdbcTemplate;

import druid.DruidUtils;

/**
 * jdbcTemplate入门
 * @author 123
 *
 */
public class jdbcTemplateDemo1 {
	public static void main(String[] args) {
		//1.导入jar包
		//2.创建JDBCTemplateDemo1
		JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDruidDataSource());
		//3.调用方法
		String sql= "update account set balance = ? where id=?";
		int u = jt.update(sql,3000,1);//一个位置对应一个值，按顺序往后写就行
		System.out.println(u);
	}
}
