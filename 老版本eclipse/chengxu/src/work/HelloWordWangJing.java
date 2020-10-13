package work;

import java.util.Scanner;

public class HelloWordWangJing {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
		System.out.println("请选择商品类型号：1.水果;2.蔬菜;3.零食");
		int trade=scan.nextInt();
		switch(trade){
		case 1:
			System.out.println("水果有：1.苹果(2.5/斤);2.梨(3/斤);3.西瓜(7/斤);4.返回最上级");
			int mark=scan.nextInt();
			switch(mark){
			case 1:
				System.out.println("请输入购买数量：");
				double number=scan.nextDouble();
				System.out.println("您要购买的是苹果"+number+"斤，需支付"+number*2.5);
				System.out.println("请支付：");
				double money=scan.nextDouble();
				if(money>=2.5*number){
					if(money==2.5*number){
						System.out.println("钱正好");
						
					}else{
						System.out.println("找零:"+(money-number*2.5)+"元");
						
					}
				}else{
					System.out.println("您钱不够，差"+(number*2.5-money)+"元");
				}
				break;
			case 2:
				System.out.println("请输入购买数量：");
				double number1=scan.nextDouble();
				System.out.println("您要购买的是梨"+number1+"斤，需支付"+number1*3);
				System.out.println("请支付：");
				double money1=scan.nextDouble();
				if(money1>=3*number1){
					if(money1==3*number1){
						System.out.println("钱正好");
						
					}else{
						System.out.println("找零:"+(money1-number1*3)+"元");
						
					}
				}else{
					System.out.println("您钱不够，差"+(number1*3-money1)+"元");
				}
				break;
			case 3:
				System.out.println("请输入购买数量：");
				double number2=scan.nextDouble();
				System.out.println("您要购买的是西瓜"+number2+"斤，需支付"+number2*7);
				System.out.println("请支付：");
				double money2=scan.nextDouble();
				if(money2>=7*number2){
					if(money2==7*number2){
						System.out.println("钱正好");
						
					}else{
						System.out.println("找零:"+(money2-number2*7)+"元");
						
					}
				}else{
					System.out.println("您钱不够，差"+(number2*7-money2)+"元");
				}
				break;
			case 4:
				break;
				
				
				
			}
			break;
		case 2:
			System.out.println("蔬菜有:1.胡萝卜(1.25/斤);2.黄瓜(1.5/斤);3.西红柿(1.0/斤);4.返回上一级");
			int mark1=scan.nextInt();
			switch(mark1){
			case 1:
				System.out.println("请输入购买数量：");
				double number=scan.nextDouble();
				System.out.println("您要购买的是胡萝卜"+number+"斤，需支付"+number*1.25);
				System.out.println("请支付：");
				double money=scan.nextDouble();
				if(money>=1.25*number){
					if(money==2.5*number){
						System.out.println("钱正好");
						
					}else{
						System.out.println("找零:"+(money-number*1.25)+"元");
						
					}
				}else{
					System.out.println("您钱不够，差"+(number*1.25-money)+"元");
				}
				break;
			case 2:
				System.out.println("请输入购买数量：");
				double number1=scan.nextDouble();
				System.out.println("您要购买的是黄瓜"+number1+"斤，需支付"+number1*1.5);
				System.out.println("请支付：");
				double money1=scan.nextDouble();
				if(money1>=1.5*number1){
					if(money1==3*number1){
						System.out.println("钱正好");
						
					}else{
						System.out.println("找零:"+(money1-number1*1.5)+"元");
						
					}
				}else{
					System.out.println("您钱不够，差"+(number1*1.5-money1)+"元");
				}
				break;
			case 3:
				System.out.println("请输入购买数量：");
				double number2=scan.nextDouble();
				System.out.println("您要购买的是西红柿"+number2+"斤，需支付"+number2*1);
				System.out.println("请支付：");
				double money2=scan.nextDouble();
				if(money2>=1*number2){
					if(money2==1*number2){
						System.out.println("钱正好");
						
					}else{
						System.out.println("找零:"+(money2-number2*1)+"元");
						
					}
				}else{
					System.out.println("您钱不够，差"+(number2*1-money2)+"元");
				}
				break;
			case 4:
				break;
				
			
			
			
			
			
			
			
			
		}
			break;
		case 3:
			System.out.println("零食有:1.辣条(3/包);2.方便面(1/包);3.延安(6/包);4.返回最上级");
			int mark3=scan.nextInt();
			switch(mark3){
			case 1:
				System.out.println("请输入购买数量：");
				double number=scan.nextDouble();
				System.out.println("您要购买的是辣条"+number+"包，需支付"+number*3);
				System.out.println("请支付：");
				double money=scan.nextDouble();
				if(money>=3*number){
					if(money==3*number){
						System.out.println("钱正好");
						
					}else{
						System.out.println("找零:"+(money-number*3)+"元");
						
					}
				}else{
					System.out.println("您钱不够，差"+(number*3-money)+"元");
				}
				break;
			case 2:
				System.out.println("请输入购买数量：");
				double number1=scan.nextDouble();
				System.out.println("您要购买的是方便面"+number1+"包，需支付"+number1*1);
				System.out.println("请支付：");
				double money1=scan.nextDouble();
				if(money1>=1*number1){
					if(money1==1*number1){
						System.out.println("钱正好");
						
					}else{
						System.out.println("找零:"+(money1-number1*1)+"元");
						
					}
				}else{
					System.out.println("您钱不够，差"+(number1*1-money1)+"元");
				}
				break;
			case 3:
				System.out.println("请输入购买数量：");
				double number2=scan.nextDouble();
				System.out.println("您要购买的是延安"+number2+"包，需支付"+number2*6);
				System.out.println("请支付：");
				double money2=scan.nextDouble();
				if(money2>=6*number2){
					if(money2==6*number2){
						System.out.println("钱正好");
						
					}else{
						System.out.println("找零:"+(money2-number2*6)+"元");
						
					}
				}else{
					System.out.println("您钱不够，差"+(number2*6-money2)+"元");
				}
				break;
			case 4:
				break;
				
			
		}
			break;
		
	}

	}
	}
}
