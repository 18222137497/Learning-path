package xxxxx;
import java.util.Arrays;
/**
 * 数组的整形排列
 * @author 123
 * 
 */
public class  GreatWang {
	/**
	 * 二维数组的冒泡排序排列
	 * @param s
	 * @return
	 */
	public static void MP(int[][] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length-1; j++) {
			if (a[i][j]>a[i][j+1]) {
				int a2=a[i][j];
				a[i][j]=a[i][j+1];
				a[i][j+1]=a2;
			}
		}			
	}
}
	/**
	 * 二维数组的全排列
	 * @param s
	 * @return
	 */
	public static int[][] QPX(int[][] a){
		int j3=-1;
		int[] a1=new int[(int)((int)(a.length)*(int)(a[0].length))];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				j3++;
				for (int j2 = j3; j2 < a1.length; j2++) {					
					a1[j2]=a[i][j];
				}	
			}
		}
		Arrays.sort(a1);
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				for (int j2 = 0; j2 < a1.length; j2++) {			
				}
			}
		}
		int c=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=a1[c];
				c++;
			}
		}		
		return a;
	}
	/**
	 * 判断回文
	 * @param s
	 * @return
	 */
	public static boolean HW(String[] s){
		String[] s1=new String[s.length];
		int a=0;
		for (int i = 0; i < s.length; i++) {
			s1[i]=s[s.length-1-i];
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		for (int i = 0; i < s1.length; i++) {
			if(s1[i]!=s[i]){
				a=1;
			}
		}
		boolean b;
		if (a==1) {
			b=false;
		}else{
			b=true;
		}
		System.out.println("是否是回文："+b);
		return b;
		
	}
	/**
	 * 将字符串数组中的数组顺序随机打乱
	 * @param x
	 * @return
	 */
	public static String[] SJSZ(String[] x){
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
}

