package day04;
//运算符的演示
public class OperDemo {

	public static void main(String[] args) {
	//1.取余
		/*	System.out.println(5%2);//(商二余一)1
		System.out.println(8%2);//0
		System.out.println(2%8);//商零余二
*/
/*	//2.++，--
		int a=5;int b=5;
		a++;//6 相当于a+1
		++b;//6 相当于赋值为b加1
	*/
	/*    int a=5,b=5;
	    int c=a++;//将a++的值5赋值给c，然后a自增
	    int d=++b;//将b自增1，然后赋值给d
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	 */
	//练习：
		/*
		 * 1.声明整形变量a，b，并同时赋值为6，2；
		 * 2.将a自增运算自增赋值给c，将b自增赋值给d
		 * 3.进行输出a，b，c，d
		 */
	   /* int a=6,b=2;
	    int c=a++;
	    int d=++b;
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	    */
//	    
//	//关系运算符
//		/*
//		 * 1.关系的>大于，<小于，>=大于等于，<=小于等于，==等于，!=不等于
//		 */
//	    int a=5,b=10,c=5;
//	    boolean b1=a>b;
//	    System.out.println(b1);
//	    System.out.println(c<b);
//	    System.out.println(a>=c);
//	    System.out.println(a<=b);
//	    System.out.println(a==c);
		
	//逻辑运算符	
	    /*
	     * 1.&&（并且）两边都为真则为真，见false则false
	     * 2.||（或者）两边有一边为真，则为真，见ture则ture
	     * 3.！（非）逻辑取法，非真则假，非假则真
	     * 4.逻辑运算时候，是建立在关系运算的基础之上
	     * 5.逻辑运算的结果也是boolean型
	     */
//        int a=5,b=10,c=5;
//        boolean b4=a<b||c++>2;
//        System.out.println(b4);
//        System.out.println(a>b||c<b);
//        System.out.println(c<=b||a>b);
//        System.out.println(a!=b||b>c);
//        System.out.println(a==b||c>b);
//        boolean b2=!(a>b);
//        System.err.println(b2);
//        System.out.println(!(a<b));
//        
//        boolean b3=a>b&&c++>2;
//        System.out.println(b3);
//        
        
        
        
        /*
        boolean b1=a>b&&c<b;
        System.out.println(b1);
        System.out.println(c<=b&&a>b);
        System.out.println(a==b&&c>b);
        System.out.println(a!=b&&b>c);
        
        */
        
	 //4.赋值运算
		/*1.简单赋值运算符是=
		 *2.扩充的赋值运算是：+=，-=，*=，/=，%=
		 *
		 */
//	    int a=5;
//	    a+=10;//a=a+10赋值给a
//	    System.out.println(a);//15
//	    a*=2;//a*2赋给a
//	    System.out.println(a);//30
//	    a/=6;//a/6赋值给a
//	    System.out.println(a);
//	    /*
//	     * 练习
//	     * -=，%=
//	     */
//	    a-=1;
//	    System.out.println(a);
//	    a%=2;
//	    System.out.println(a);
//	    
	 //5.字符串连接运算符
		/*
		 * 1.+连接（两边都是数字则作加法运算
		 *          两边出现字符串，则做字符串连接) 
		 * 
		 */
//	    System.out.println(100+200+""+300);//300300
//	    System.out.println(100+200+300+"");//600(类型改变为字符串）
//	    System.out.println(""+100+200+300);//100200300
	    int age = 39;
	    
	    System.out.println("age=");
	    System.out.println(age);
	    System.out.println("age="+age);//age=39
	    System.out.println("我今年年龄"+age+"岁了");
	    System.out.println("我的年龄是"+age);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	}

}
