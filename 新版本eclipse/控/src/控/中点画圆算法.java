package 控;
/**
 * 参考图形学书52页
 * @author 123
 *
 */
public class 中点画圆算法 {
	public static int[][] LX(int r) {
		int x,y;
		float d;
		int[][] arr=new int[11][11];
		x=0;
		y=r;
		arr[x][y]=1;
		d=(float) (1.25-r);
		while (x<=y) {
			if (d<0) {
				d+=2*x+3;
			}else {
				d+=2*(x-y)+5;
				y--;
			}
			x++;
			arr[x][y]=1;
		}
		return arr;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 中点画圆算法.LX(10).length; i++) {
			for (int j = 0; j < 中点画圆算法.LX(10)[i].length; j++) {
				System.out.print(中点画圆算法.LX(10)[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
