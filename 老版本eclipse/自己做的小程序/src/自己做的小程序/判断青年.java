package 自己做的小程序;
import java.util.Scanner;
//判断青年>=18<=50
public class 判断青年 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你的年龄？");
		int age=scan.nextInt();
		System.out.println(age>=18&&age<=50);

	}

}
