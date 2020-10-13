package xxxxx;

public class 空心菱形 {
		public static void main(String args[]) {
			int a = 17;// 输出的菱形有多少行，请赋值成奇数

			int b = (a + 1) / 2;// 菱形最多一行
			for (int i = 1; i <= b; i++) {// 循环菱形数量越来越多的几行
				for (int j = 1; j <= b - i; j++) {// 输出空格，数量=最后一行-当前行数
					System.out.print("  ");
				}
				for (int h = 1; h < 20; h++) {// 输出星号，数量=行数*2-1
					if(i==h){
					System.out.print("*");
				}
					}
				if(i>1){
				for (int j = 0;j<=2+4*(i-1)-4;j++) {
					System.out.print(" ");
				}
				for (int j = 1; j < 20; j++) {
					if(i==j){
						System.out.print("*");
					}
				}}
				
				System.out.println();// 换行
			}

			int c = a - b;// 计算剩下的几行，这几行星号的数量是递减的
			for (int i = 1; i <= c; i++) {// 循环菱形数量越来越少的行数
				for (int h = 1; h<= i; h++) {// 输出空格，数量等于当前的行数
					System.out.print("  ");
				}
				for (int j = 1; j <= 20; j++) {// 输出星号，数量等于（总数-当前行数）*2-1
					if(i==j){System.out.print("*");
				}
					}
				for (int j =30-4*i+1 ; j>0 ; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j < 20; j++) {
					if(i==j&&i!=c){
						System.out.print("*");
					}
				
				
				}
				System.out.println();
			}

		}
	

}
