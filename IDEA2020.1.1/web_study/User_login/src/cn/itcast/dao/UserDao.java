package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 操作数据库的方法
 */
public class UserDao {
    //声明JDBCTemplate对象共用
    private JdbcTemplate jdbctemplate=new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 登陆方法
     * @param user 只有用户名和密码
     * @return user包含用户全部数据 没有查询到返回null
     */

    public User login(User user){
        try {
            //1.编写sql
            String sql="select * from user where name=? and password=?";
            //2.调用query方法
            User user1 = jdbctemplate.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    user.getUsername(), user.getPassword());
            return user1;
        } catch (Exception e) {
           //e.printStackTrace();//记录日志
            return null;
        }
    }
}
