package day05;
//演示while语句
public class While {

	public static void main(String[] args) {
/*		int num=1;
		while(num<=9){
			System.out.println(num+"*9="+num*9);
			num++;
			
		}
		System.out.println("over");
		
	}
*/
		int times=0;
		while(times<10){
			System.out.println("已经离开："+times);
			times++;
		}
		System.out.println("over");
		/*
		 * 执行过程：
		 *      times=0
		 *      true  输出 times=1；
		 *      true  输出 times=2；
		 *      true  输出 times=3；
		 *      true  输出 times=4；
		 *      。。。。。。。
		 *      true  输出 times=10；
		 *      false 输出 循环结束
		 *       
		 */
		
		
		
		
	}
}
