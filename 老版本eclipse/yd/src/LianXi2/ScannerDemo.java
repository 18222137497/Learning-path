package LianXi2;
import java.util.Scanner;//1
//Scanner用法
public class ScannerDemo {

	public static void main(String[] args) {
	//2
		Scanner scan = new Scanner(System.in);
	//3	
        System.out.println("请输入您的年龄？");
        int age =scan.nextInt();
        System.out.println(age);
	}

}

