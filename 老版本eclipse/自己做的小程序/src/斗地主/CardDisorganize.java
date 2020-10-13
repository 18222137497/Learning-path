package 斗地主;

import java.util.Arrays;

/**
 * 对牌的操作
 * @author 123
 *
 */
public class CardDisorganize {
	/**
	 * 来自最聪明的汪大爷自己设计出来的将数组中的元素打乱顺序的方法
	 * @param x
	 * @return
	 */
	public static String[] GreatWangSJSZ(String[] x){
		int[] a=new int[x.length];
		boolean b;
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)(Math.random()*x.length);
			b=true;
			for (int j = 0; j < i; j++) {
				if (a[i]==a[j]) {
					b=false;
					break;
				}
			}
			if (b==false) {
				i--;
			}
		}
		System.out.println(Arrays.toString(a));
		String[] y=new String[x.length];
		for (int i = 0; i < y.length; i++) {
			y[i]=x[i];
		}
		for (int i = 0; i < x.length; i++) {
			x[a[i]]=y[i];
		}
		return x;
		}
	/**
	 * 将数组合并并将数组中元素顺序打乱
	 * @param x1
	 * @param x2
	 * @param x3
	 * @return
	 */
	public static String[] CardDisorganize(String[] x1,String[] x2,String[] x3){
		/*将数组合并*/
		String[] newCard=new String[x1.length+x2.length+x3.length];
		for (int i = 0; i < x1.length; i++) {
			newCard[i]=x1[i];
		}
		for (int i = x1.length,j=0; i < x1.length+x2.length; i++,j++) {
			newCard[i]=x2[j];
		}
		for (int i = x1.length+x2.length,j=0; i < x1.length+x2.length+x3.length; i++,j++) {
			newCard[i]=x3[j];
		}
		int[] arr=new int[newCard.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		return GreatWangSJSZ(newCard);//随机排序
	}
	/**
	 * 给每个人发牌
	 * @param Library
	 * @param x1
	 * @param x2
	 * @param x3
	 */
    public static void Deal(String[] Library,String[] x1,String[] x2,String[] x3){
    	String[] king=new String[3];
    	for (int i = 0; i < king.length; i++) {//三张底牌
			king[i]=Library[Library.length-3+i];
		}
    	for (int i = 0,j=0,g=0,n=0,m=0; i < Library.length-3; i++,j++) {
    		if (j==0) {
				x1[g]=Library[i];
				g++;
			}
			if (j==1) {
				x2[n]=Library[i];
				n++;
			}
			if (j==2) {
				x3[m]=Library[i];
				m++;
				j=-1;
			}	
		}
    	System.out.println(Arrays.toString(king));
    	
    }
}
