package 自己做的小程序;

import java.util.Scanner;

public class 成绩评定 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入成绩：");
		double performance=scan.nextDouble();
		if(performance<60){
			System.out.println("您的成绩为不及格！");
		}else{
			if(performance>=60&&performance<70){
				System.out.println("您的成绩为及格！");
			}else{
				if(performance>=70&&performance<80){
					System.out.println("您的成绩为中等！");
				}else{
					if(performance>=80&&performance<90){
					System.out.println("您的成绩为良好！");	
					}else{
						if(performance>=90&&performance<100){
							System.out.println("您的成绩为优秀！");
						}else{
							if(performance==100){
								System.out.println("牛逼！");
							}
						}
					}
				}
			}
		}

	}

}
