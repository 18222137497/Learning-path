package 集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 斗地主发牌
 * @author 123
 *
 */
public class TextPoker {
	public static void main(String[] args) {
		ArrayList<String> poker=new ArrayList<String>(); 
		poker.add("大王");
		poker.add("小王");
		String[] colors= {"♥","♣","♦","♠"};
		String[] pokers= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		for (String string : pokers) {//将花色和卡字合并放入集合
			for (String string2 : colors) {
				poker.add(string+string2);
			}
		}
		Collections.shuffle(poker);//打乱集合中的元素顺序
		ArrayList<String> person1=new ArrayList<String>();
		ArrayList<String> person2=new ArrayList<String>();
		ArrayList<String> person3=new ArrayList<String>();
		ArrayList<String> dipai=new ArrayList<String>();
		for (int i = 0; i < poker.size(); i++) {
			String arr=poker.get(i);
			if (i>=51) {
				dipai.add(arr);
			}
			if (i%3==0) {
				person1.add(arr);
			}
			if (i%3==1) {
				person2.add(arr);
			}
			if (i%3==2) {
				person3.add(arr);
			}
		}
		System.out.println("1号"+person1);
		System.out.println("2号"+person2);
		System.out.println("3号"+person3);
		System.out.println("底牌"+dipai);
	}
	
}
