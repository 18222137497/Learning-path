package 自己做的小程序;

import java.util.Scanner;

public class 计算某年某月天数 {

	public static void main(String[] args) {
		System.out.println("请输入一个年和月，例：2019-3");
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		int year=
				Integer.parseInt(//将字符串转成整数
						input.substring(0,4 ));//截取子字符串
		int month=Integer.parseInt(
				input.substring(5));
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		    System.out.println(year+"年"+month+"有31天");
		    break;
		case 4:
		case 6:
		case 9:
		case 11:
		System.out.println(year+"年"+month+"有30天");
		break;
		case 2:
		    if(year%4==0&&year%100!=0||year%400==0){
		    	System.out.println(year+"年"+month+"有29天");
		    	
		    	
		    }else{
		    	System.out.println(year+"年"+month+"有28天");
		    	
		    }
		break;
		default://不满足前面条件
			System.out.println("输入有误");
			break;

	}

}
}
