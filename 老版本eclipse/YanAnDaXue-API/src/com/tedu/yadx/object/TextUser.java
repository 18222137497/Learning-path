package com.tedu.yadx.object;

public class TextUser {
	public static void main(String[] args) {
		User u=new User();
		System.out.println(u);//com.tedu.yadx.object.User@19e0bfd
		User u1=new User();
		User u2=new User();
		System.out.println(u1.equals(u2));
		System.out.println(u1==u2);
		
	}
	
	
}
