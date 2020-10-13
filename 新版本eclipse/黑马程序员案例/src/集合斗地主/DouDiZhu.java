package 集合斗地主;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 斗地主综合案例有序版本
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.排序
 * 5.看牌
 * @author 123
 *
 */
public class DouDiZhu {
	public static void main(String[] args) {
	//1.准备牌
		//创建一个map集合存储索引和组装好的牌
		HashMap<Integer,String> poker=new HashMap<Integer, String>();
		//创建一个List集合，存储牌的索引
		ArrayList<Integer> pokerIndex=new ArrayList<Integer>();
		//定义两个集合存储花色和牌的序号
		List<String> colors=List.of("♥","♠","♣","♦");
		List<String> numbers=List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
		//把大王和小王存储到集合
		//定义一个牌的索引
		 int index=0;
		 poker.put(index, "大王");
		 pokerIndex.add(index);
		 index++;
		 poker.put(index, "小王");
		 pokerIndex.add(index);
		 index++;
		 //循环嵌套遍历两个集合，组装52张牌，储存到集合总
		 for(String number:numbers) {
			 for (String color:colors) {
				poker.put(index, color+number);
				pokerIndex.add(index);
				index++;
			}
			 
		 }
		 System.out.println(poker);//map集合
		 System.out.println(pokerIndex);//索引集合
	//2.洗牌
		 //使用Collections中的方法Collections.shuffle(List);
		 Collections.shuffle(pokerIndex);
		 System.out.println(pokerIndex);
	//3.发牌
		 //定义4个集合，存储玩家的索引和底牌的索引
		 ArrayList<Integer> palyer01=new ArrayList<Integer>();
		 ArrayList<Integer> palyer02=new ArrayList<Integer>();
		 ArrayList<Integer> palyer03=new ArrayList<Integer>();
		 ArrayList<Integer> diPai=new ArrayList<Integer>();
		 //遍历存储牌索引的List集合，获取每一个牌的索引
		 for (int i = 0; i < pokerIndex.size(); i++) {
			Integer in=pokerIndex.get(i);
			//先判断底牌
			if (i>=51) {
				diPai.add(in);
			}else if (i%3==0) {
				palyer01.add(in);
			}else if (i%3==1) {
				palyer02.add(in);
			}else if (i%3==2) {
				palyer03.add(in);
			}
		}
	//4.排序
		 //使用Collections.sort(list)    默认升序排序
		 Collections.sort(palyer01);
		 Collections.sort(palyer02);
		 Collections.sort(palyer03);
		 Collections.sort(diPai);
		 
		 looePoker("刘德华", poker, palyer01);
		 looePoker("周润发", poker, palyer02);
		 looePoker("周星驰", poker, palyer03);
		 looePoker("底牌", poker, diPai);
}
	//5.看牌
	 //定义一个看牌的方法，提高代码的复用性
	 /*参数：
	 	String name;//玩家名称
	 	HashMap<Integer,String> poker:存储牌的poker集合
	 	ArrayList<Integer> list:存储玩家和底牌的List集合
		查表法：
			遍历玩家或者底牌的集合，获取牌的索引
			使用牌的索引到map集合中调取键对应的值
	 */	
	public static void looePoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list) {
		 System.out.print(name+" ");
		 for (Integer key:list) {
			String value=poker.get(key);
			System.out.print(value+" ");
		}
		 System.out.println();
	}
}
