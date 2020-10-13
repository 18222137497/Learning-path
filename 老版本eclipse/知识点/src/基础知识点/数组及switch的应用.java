package 基础知识点;

import java.util.Scanner;

public class 数组及switch的应用 {

	public static void main(String[] args) {
		System.out.println("请输入一个数字：1表示春天，2表示夏天，3表示秋天，4表示冬天");
		Scanner scan=new Scanner(System.in);
		String[] arr={"春天","夏天","秋天","冬天"};
		int index=scan.nextInt();
		switch(arr[index-1]){//数组下标从0开始所以输入的3就等于数组中的第4位所以要减一
		case"春天":
			System.out.println("1到3月");
			break;
		case"夏天":
			System.out.println("4月到6月");
			break;
		case"秋天":
			System.out.println("7月到9月");
			break;
		case"冬天":
			System.out.println("10月到12月");
			break;
		default://不满足前面条件
			System.out.println("输入有误");
			break;

	}

}
}
