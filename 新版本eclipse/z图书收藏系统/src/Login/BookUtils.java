package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 管理账户的类
 * @author 123
 *
 */
public class BookUtils extends DruidUtils{
	public static void main(String[] args) {
		//new BookUtils().userSelect(1);//查询用户收藏书籍
		new BookUtils().bookSelect();;//查询图书馆书籍
	}
	private static Scanner s;
	private static int[] arr;
	private static int index=0;
	private static SimpleDateFormat dateFormat;
	static{
		dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		s=new Scanner(System.in);
		arr= new int[]{1234,4562,4845,8443,1564,8423,4183,1445};
	}
	{//构造代码块
		Date date = new Date();
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("|"+dateFormat.format(date));
		if(index>arr.length) {
			index=0;
		}

	}
	@Override
	public void bookSelect() {//查询图书馆书籍
		Connection c =null;
		PreparedStatement s =null;
		ResultSet r =null;
		try {
			c = super.getConnection();
			s = c.prepareStatement("select * from bookstore");
			r = s.executeQuery();
			while(r.next()) {
				System.out.println("|书号："+r.getInt(1)+"	书名："+r.getString(2));
			}
			System.out.println("------------------------------------------------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.cloes(c, s, r);
		}
	}

	@Override
	public void userSelect(int i) {//查询用户收藏书籍
		Connection c =null;
		PreparedStatement s =null;
		ResultSet r =null;
		try {
			c = super.getConnection();
			s = c.prepareStatement("select t2.addtime,t3.bookname from user t1,link t2,bookstore t3 where t1.id=t2.user_id and t2.books_id=t3.bookstore_id and t1.id=?");
			s.setInt(1, i);
			r = s.executeQuery();
			while(r.next()) {
				System.out.println("|添加时间:"+r.getDate(1)+" "+r.getTime(1)+"	书名:"+r.getString(2));
			}
			System.out.println("------------------------------------------------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.cloes(c, s, r);
		}
		
		
	}

	@Override
	public void addUserBook() {//给用户收藏夹增加一本书
		
	}

	@Override
	public void subUserBook() {//给用户收藏夹删除一本书
		
	}

	@Override
	public void alterUserPassword() {//修改密码
		
	}

	public void createUser() {//创建用户
		System.out.println("|	创建用户	    ");
		System.out.print  ("|账号:");
		String username=s.next();
		System.out.print  ("|密码:");
		String password=s.next();
		System.out.print  ("|昵称:");
		String name=s.next();
		System.out.print("|验证码["+arr[index]+"]:");
		int code=11111;
		try {
		code=s.nextInt();
		} catch(InputMismatchException ie) {
			index++;
			System.out.println("|	请输入数字!");		
		}
		if (code!=arr[index]) {
			index++;
			try {
			int numberexception=3/0;
			} catch(ArithmeticException ae) {
				System.out.println("|	验证码错误!");
				System.out.println("------------------------------------------------------------------------");
			}finally {
				System.exit(0);
			}
		}
		index++;
		Connection c =null;
		PreparedStatement s=null;
		Statement ss =null;
		try {
			c = DruidUtils.getConnection();
			ss = c.createStatement();
			s = c.prepareStatement("INSERT INTO USER VALUES(NULL,?,?,?)");
			s.setString(1, username);
			s.setString(2, password);
			s.setString(3, name);
			ss.executeUpdate("ALTER TABLE USER AUTO_INCREMENT =1");//改变自增长索引
			int executeUpdate = s.executeUpdate();
			if (executeUpdate==1) {
				System.out.println("|	用户创建成功!");
				System.out.println("------------------------------------------------------------------------");
			}
		} catch (SQLException e) {
			System.out.println("|	创建失败!用户已存在");
		}
		finally {
			DruidUtils.cloes(c, s, null);
			DruidUtils.cloes(null, ss, null);
		}
	}
	
	@Override
	public void loginUser() {//用户登录
		
	}

	@Override
	public void updateUserName() {//修改用户名称
		
	}
	
}
