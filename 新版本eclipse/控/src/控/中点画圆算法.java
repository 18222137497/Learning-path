package ��;
/**
 * �ο�ͼ��ѧ��52ҳ
 * @author 123
 *
 */
public class �е㻭Բ�㷨 {
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
		for (int i = 0; i < �е㻭Բ�㷨.LX(10).length; i++) {
			for (int j = 0; j < �е㻭Բ�㷨.LX(10)[i].length; j++) {
				System.out.print(�е㻭Բ�㷨.LX(10)[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
