package day04;
//���������ʾ
public class OperDemo {

	public static void main(String[] args) {
	//1.ȡ��
		/*	System.out.println(5%2);//(�̶���һ)1
		System.out.println(8%2);//0
		System.out.println(2%8);//�������
*/
/*	//2.++��--
		int a=5;int b=5;
		a++;//6 �൱��a+1
		++b;//6 �൱�ڸ�ֵΪb��1
	*/
	/*    int a=5,b=5;
	    int c=a++;//��a++��ֵ5��ֵ��c��Ȼ��a����
	    int d=++b;//��b����1��Ȼ��ֵ��d
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	 */
	//��ϰ��
		/*
		 * 1.�������α���a��b����ͬʱ��ֵΪ6��2��
		 * 2.��a��������������ֵ��c����b������ֵ��d
		 * 3.�������a��b��c��d
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
//	//��ϵ�����
//		/*
//		 * 1.��ϵ��>���ڣ�<С�ڣ�>=���ڵ��ڣ�<=С�ڵ��ڣ�==���ڣ�!=������
//		 */
//	    int a=5,b=10,c=5;
//	    boolean b1=a>b;
//	    System.out.println(b1);
//	    System.out.println(c<b);
//	    System.out.println(a>=c);
//	    System.out.println(a<=b);
//	    System.out.println(a==c);
		
	//�߼������	
	    /*
	     * 1.&&�����ң����߶�Ϊ����Ϊ�棬��false��false
	     * 2.||�����ߣ�������һ��Ϊ�棬��Ϊ�棬��ture��ture
	     * 3.�����ǣ��߼�ȡ����������٣��Ǽ�����
	     * 4.�߼�����ʱ���ǽ����ڹ�ϵ����Ļ���֮��
	     * 5.�߼�����Ľ��Ҳ��boolean��
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
        
	 //4.��ֵ����
		/*1.�򵥸�ֵ�������=
		 *2.����ĸ�ֵ�����ǣ�+=��-=��*=��/=��%=
		 *
		 */
//	    int a=5;
//	    a+=10;//a=a+10��ֵ��a
//	    System.out.println(a);//15
//	    a*=2;//a*2����a
//	    System.out.println(a);//30
//	    a/=6;//a/6��ֵ��a
//	    System.out.println(a);
//	    /*
//	     * ��ϰ
//	     * -=��%=
//	     */
//	    a-=1;
//	    System.out.println(a);
//	    a%=2;
//	    System.out.println(a);
//	    
	 //5.�ַ������������
		/*
		 * 1.+���ӣ����߶������������ӷ�����
		 *          ���߳����ַ����������ַ�������) 
		 * 
		 */
//	    System.out.println(100+200+""+300);//300300
//	    System.out.println(100+200+300+"");//600(���͸ı�Ϊ�ַ�����
//	    System.out.println(""+100+200+300);//100200300
	    int age = 39;
	    
	    System.out.println("age=");
	    System.out.println(age);
	    System.out.println("age="+age);//age=39
	    System.out.println("�ҽ�������"+age+"����");
	    System.out.println("�ҵ�������"+age);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	}

}
