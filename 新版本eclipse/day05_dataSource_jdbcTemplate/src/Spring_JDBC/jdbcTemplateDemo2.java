package Spring_JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import druid.DruidUtils;

public class jdbcTemplateDemo2 {
	public static void main(String[] args) {
		JdbcTemplate jt=new JdbcTemplate(DruidUtils.getDruidDataSource());
		//1.�޸�����
		int c1 = jt.update("update account set balance = ? where id = ?",1000,1);
		System.out.println(c1);
		//2.�������
		int c2 = jt.update("insert into account(id , name,balance) values(3,'wangjing',1000)");
		System.out.println(c2);
		//3.ɾ������
		int c3 = jt.update("delete from account where id=3");
		System.out.println(c3);
		//4.��ѯidΪ1�ļ�¼�������װΪmap����   ע�⣬���������ѯ�Ľ����ֻ����1
		Map<String, Object> m=new HashMap<String, Object>();
		m= jt.queryForMap("select * from account where id=1");
		System.out.println(m);
		//5.��ѯ���м�¼�����װΪList����
		List<Map<String, Object>> list = jt.queryForList("select * from account");
		System.out.println(list);
		//6.��ѯ���м�¼�������װΪEmp�����List����
		List<Emp> q = jt.query("select * from account",new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int i) throws SQLException {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double balance = rs.getDouble(3);
				Emp e=new Emp(id,name,balance);
				return e;
			}
			
		});
		System.out.println(q);
		//6.1 ��ѯ���м�¼�������װΪEmp�����List���ϣ��������Ҫע�⣡��������������
		List<Emp> qq = jt.query("select * from account",new BeanPropertyRowMapper<Emp>(Emp.class));
		//��������������������Emp���������setget����������������
		System.out.println(qq);
		//7.��ѯ�ܼ�¼�� ,һ�����ھۺϺ���
		Long l = jt.queryForObject("select count(id) from account", long.class);
		System.out.println(l);
	}
}
