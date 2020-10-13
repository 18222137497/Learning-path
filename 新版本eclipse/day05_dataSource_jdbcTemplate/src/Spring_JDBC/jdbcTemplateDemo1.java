package Spring_JDBC;

import org.springframework.jdbc.core.JdbcTemplate;

import druid.DruidUtils;

/**
 * jdbcTemplate����
 * @author 123
 *
 */
public class jdbcTemplateDemo1 {
	public static void main(String[] args) {
		//1.����jar��
		//2.����JDBCTemplateDemo1
		JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDruidDataSource());
		//3.���÷���
		String sql= "update account set balance = ? where id=?";
		int u = jt.update(sql,3000,1);//һ��λ�ö�Ӧһ��ֵ����˳������д����
		System.out.println(u);
	}
}
