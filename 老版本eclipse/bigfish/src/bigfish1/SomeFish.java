package bigfish1;

import org.junit.Test;

import bigfish.BigFish;

/**
 * Junit��Ԫ����
 * @author 123
 *
 */

public class SomeFish {
	@Test
	public void CreateBigFish(){
		BigFish f = new BigFish("3_0");
		System.out.println(f);
	}

}
