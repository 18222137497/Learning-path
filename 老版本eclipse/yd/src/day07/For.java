package day07;
//99乘法表 多行多列 使用for（嵌套循环）
public class For {

	public static void main(String[] args) {
		for(int a=1;a<10;a++){//控制行
			for(int b=1;b<10;b++){//控制列
				
				System.out.print(a+"*"+b+"="+a*b+"	");
			}
			System.out.println();
		}

	}

}
