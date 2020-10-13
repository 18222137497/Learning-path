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
 * �����˻�����
 * @author 123
 *
 */
public class BookUtils extends DruidUtils{
	public static void main(String[] args) {
		//new BookUtils().userSelect(1);//��ѯ�û��ղ��鼮
		new BookUtils().bookSelect();;//��ѯͼ����鼮
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
	{//��������
		Date date = new Date();
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("|"+dateFormat.format(date));
		if(index>arr.length) {
			index=0;
		}

	}
	@Override
	public void bookSelect() {//��ѯͼ����鼮
		Connection c =null;
		PreparedStatement s =null;
		ResultSet r =null;
		try {
			c = super.getConnection();
			s = c.prepareStatement("select * from bookstore");
			r = s.executeQuery();
			while(r.next()) {
				System.out.println("|��ţ�"+r.getInt(1)+"	������"+r.getString(2));
			}
			System.out.println("------------------------------------------------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.cloes(c, s, r);
		}
	}

	@Override
	public void userSelect(int i) {//��ѯ�û��ղ��鼮
		Connection c =null;
		PreparedStatement s =null;
		ResultSet r =null;
		try {
			c = super.getConnection();
			s = c.prepareStatement("select t2.addtime,t3.bookname from user t1,link t2,bookstore t3 where t1.id=t2.user_id and t2.books_id=t3.bookstore_id and t1.id=?");
			s.setInt(1, i);
			r = s.executeQuery();
			while(r.next()) {
				System.out.println("|���ʱ��:"+r.getDate(1)+" "+r.getTime(1)+"	����:"+r.getString(2));
			}
			System.out.println("------------------------------------------------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.cloes(c, s, r);
		}
		
		
	}

	@Override
	public void addUserBook() {//���û��ղؼ�����һ����
		
	}

	@Override
	public void subUserBook() {//���û��ղؼ�ɾ��һ����
		
	}

	@Override
	public void alterUserPassword() {//�޸�����
		
	}

	public void createUser() {//�����û�
		System.out.println("|	�����û�	    ");
		System.out.print  ("|�˺�:");
		String username=s.next();
		System.out.print  ("|����:");
		String password=s.next();
		System.out.print  ("|�ǳ�:");
		String name=s.next();
		System.out.print("|��֤��["+arr[index]+"]:");
		int code=11111;
		try {
		code=s.nextInt();
		} catch(InputMismatchException ie) {
			index++;
			System.out.println("|	����������!");		
		}
		if (code!=arr[index]) {
			index++;
			try {
			int numberexception=3/0;
			} catch(ArithmeticException ae) {
				System.out.println("|	��֤�����!");
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
			ss.executeUpdate("ALTER TABLE USER AUTO_INCREMENT =1");//�ı�����������
			int executeUpdate = s.executeUpdate();
			if (executeUpdate==1) {
				System.out.println("|	�û������ɹ�!");
				System.out.println("------------------------------------------------------------------------");
			}
		} catch (SQLException e) {
			System.out.println("|	����ʧ��!�û��Ѵ���");
		}
		finally {
			DruidUtils.cloes(c, s, null);
			DruidUtils.cloes(null, ss, null);
		}
	}
	
	@Override
	public void loginUser() {//�û���¼
		
	}

	@Override
	public void updateUserName() {//�޸��û�����
		
	}
	
}
