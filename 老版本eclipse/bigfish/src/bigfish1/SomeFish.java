package bigfish1;

import org.junit.Test;

import bigfish.BigFish;

/**
 * Junitµ¥Ôª²âÊÔ
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
