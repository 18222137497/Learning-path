package com.tedu.yadx.string;

import java.util.Arrays;

import org.junit.Test;

public class homeWork {
	@Test
	public void abd(){
		String s="someapp/manager/emplist.action";
		int[] s1=new int[s.length()];
		for (int i = 0; i < s.length(); i++) {//lastIndexOf·½·¨
		int index=s.indexOf("/",i);
		System.out.print(index+1+" ");
		s1[i]=index+1;
		}
		System.out.println();
		Arrays.sort(s1);
		s=s.substring(s1[s1.length-1]);
		System.out.println(s);
	}
}
