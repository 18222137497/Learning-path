package cn.tedu.demo;

import java.util.Scanner;

public class Demo {

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
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		System.out.println("请输入一个年和月，例：2019-3");
//		Scanner scan=new Scanner(System.in);
//		String input=scan.next();
//		int year=
//				Integer.parseInt(//将字符串转成整数
//						input.substring(0,4 ));//截取子字符串
//		int month=Integer.parseInt(
//				input.substring(5));
//		switch(month){
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//		    System.out.println(year+"年"+month+"有31天");
//		    break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//		System.out.println(year+"年"+month+"有30天");
//		break;
//		case 2:
//		    if(year%4==0&&year%100!=0||year%400==0){
//		    	System.out.println(year+"年"+month+"有29天");
//		    	
//		    	
//		    }else{
//		    	System.out.println(year+"年"+month+"有28天");
//		    	
//		    }
//		break;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		System.out.println("请输入A-E中的一个字母");
//		Scanner scan=new Scanner(System.in);
//		String data=scan.next();
//		data=data.toUpperCase();//转成大写
//		switch(data){
//		case"A":
//			System.out.println("优秀");
//			break;
//		case"B":
//			System.out.println("良好");
//			break;
//		case"C":
//			System.out.println("中");
//			break;
//		case"D":
//			System.out.println("及格");
//			break;
//		case"E":
//			System.out.println("不及格");
//			break;
//		default://?????
//			System.out.println("输入有误");
//			break;
//			
			
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		Scanner scan=new Scanner(System.in);
//		System.out.print("请输入单价：");
//		int a=scan.nextInt();
//		System.out.print("请输入数量：");
//		int b=scan.nextInt();
//		System.out.print("请输入付款金额：");
//		int c=scan.nextInt();
//		int d=a*b;
//		if(c>=d&&d>500){
//			System.out.println("应收金额："+b*0.8+" "+"实收："+c+"找零："+(c-d*0.8));
//			
//			
//		}else if(c>=d&&d<500){
//			System.out.println("应收："+d+" "+"实收"+c+" "+"找零："+(c-d));
//			
//		
//		}else{
//			System.out.println("您钱给少了");
//		}
//		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		System.out.println("输入三个值，用空格隔开");
//		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		int c=scan.nextInt();
//		if(a<b){
//			int temp=a;
//			a=b;
//			b=temp;
//			
//		}
//		if(a<c){
//			a=a+c;
//			c=a-c;
//			a=a-c;
//			
//		}
//		System.out.println("最大值是："+a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("请输入当前温度（n c/f）：");
//		int n=scan.nextInt();
//		char temp=scan.next().trim().charAt(0);
//		//next()接收字符串                   ！！！！
//		//trim()去掉字符串左右空格           ！！！！
//		//charAt(0)是将字符串第一ge字符返回  ！！！！
//		if(temp=='c'||temp=='C'){
//			//	F=9C/5+32
//			double result=
//					9*n/5.0+32;
//			//保留小数，将除数变成浮点数
//			//进行四舍五入
//			int data=(int)(result+0.5);//四舍五入！！！！！！
//			System.out.println("输入的温度是"+n+"	"+temp);
//			System.out.println("转换后:"+data+"F");
//		}else if(temp=='f'||temp=='F'){
//			double result=5*(n-32)/9.0;
//			int data=(int)(result+0.5);
//			System.out.println("输入的温度是"+n+"	"+temp);
//			System.out.println("转换后："+data+"C");
//			
//		}else{
//			System.out.println("请输入正确的温度格式(n C/F)");
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		byte flight=11;
//		//计算航班
//		//每周那一天有航班
//		String[] data={"周日","周一","周二","周三","周四","周五","周六"};
//		//00001011
//		//周一 周三
//		for(int i=0;i<7;i++){
//			if((flight&(1<<i))!=0){
//				System.out.print(data[i]+"	");
//			
//			}
//			
//		}

		
		
		
		
		
		
		
		
		
		
//		char ch='\u4e00';
//		for(int i=1;i<=20000;i++){//两万中文
//			System.out.print((char)(ch+i));
//			if(i%50==0){
//			System.out.println("	");
//			}
//		
//		}
//			
//		double b1 =3.0;
//		double b2 =2.5;
//		//如果两个数能通过2的n次方表示，结果就是预期的
//		System.out.println(b1-b2);
//		char a='中';
//		a=2000;//通过整数定义，不能超过范围
//		a='\u4e00';//前缀加16进制数
////		int A,b,c;
//		int a1=10,b1=20,c1;
		//代码块
	/*	{
			int score=90;
			System.out.println(score);
			//从变量声明到最近的括号结束
		}*/
		//System.out.println(score);
		

	}//作用域age

}
