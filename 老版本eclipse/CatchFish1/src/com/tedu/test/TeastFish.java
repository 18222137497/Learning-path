package com.tedu.test;

import org.junit.Test;

import com.tedu.cathfish.Fish;

/**
 * Junit��Ԫ����
 * @author wed-01
 *
 */
public class TeastFish {
	@Test
	public void CreateFish(){
	Fish f = new Fish("3_0");
	System.out.println(f);
}
}
