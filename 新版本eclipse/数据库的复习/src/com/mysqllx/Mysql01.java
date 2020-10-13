package com.mysqllx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

public class Mysql01 {
	public static void main(String[] args) {
//		boolean b=true;
//		int i=1;
//		while(b) {
//			try {
//			Sqlselect("user",i);
//			i++;
//			}catch(Exception e) {
//				b=false;
//			}
//		}
//		Sqlselect("use", 3);
		Sqlselects();
		
	}
	public static void Sqlselects() {
		boolean b=true;
		int i=1;
		while(b) {
			Sqlselect("user",i);
			i++;
			if (i==5) {
				break;
			}
		}
	}
	public static void Sqlselect(String s,int a) {
		Connection c=null;
		PreparedStatement ps =null;
		ResultSet r =null;
		try {
			c = MysqlUtils.getConnection();
			ps= c.prepareStatement("select * from "+s+" where id=?");
			ps.setInt(1, a);
			r = ps.executeQuery();
			while(r.next()) {
			System.out.println("id£∫"+r.getInt(1)+"’À∫≈£∫"+r.getString(2)+"√‹¬Î£∫"+r.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			MysqlUtils.cloes(c, r, ps);
		}
	}
}
