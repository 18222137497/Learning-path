package XJB;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class 小程序 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;
		int f=6;
		boolean q=true;
		for(int k=100000;k>1;k--){
		System.out.println("欢迎光临");
		System.out.println("进入商城:(请输入true或false)");
		boolean l=scan.nextBoolean();
		if(l==q){		
		for(int z=100;z>0;z--){
			System.out.println("选择商品号：");
			int y=scan.nextInt();
			if(y==a){
				System.out.println("纯棉布料，单价为：100");
				System.out.println("输入购买数量：");
				int x=scan.nextInt();
				System.out.println("您要购买的是：纯棉布料"+x+"斤，是否购买：（请输入true或者false）");			
				boolean o=scan.nextBoolean();
				if(o==q){
					System.out.println("纯棉布料"+x+"斤，总共"+x*100+"元");
					System.out.println("是否继续购买？（请输入true或false）");
					boolean m=scan.nextBoolean();					
				}else{
					System.out.println("重新购买？(请输入true或false)");
					boolean n=scan.nextBoolean();
					if(n==q){
						continue;
					}else{
						break;
					}
				}
			}
				
			
		}
		
		
		
		

	}else{
		break;
		}
		}
		System.out.println("欢迎下次再来！");
	}
	}


