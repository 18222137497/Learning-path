package xxxxx;


public class 静态与非静态的调用{
    static int arg;
	public static void main(String[] args) {
		System.out.println(arg);
	}
	public void map(){
		System.out.println(arg);//静态的成员变量可以被非静态和静态的调用
		                        //非静态的成员变量只能被非静态的调用
	}


}
