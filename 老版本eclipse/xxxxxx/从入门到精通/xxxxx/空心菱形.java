package xxxxx;

public class �������� {
		public static void main(String args[]) {
			int a = 17;// ����������ж����У��븳ֵ������

			int b = (a + 1) / 2;// �������һ��
			for (int i = 1; i <= b; i++) {// ѭ����������Խ��Խ��ļ���
				for (int j = 1; j <= b - i; j++) {// ����ո�����=���һ��-��ǰ����
					System.out.print("  ");
				}
				for (int h = 1; h < 20; h++) {// ����Ǻţ�����=����*2-1
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
				
				System.out.println();// ����
			}

			int c = a - b;// ����ʣ�µļ��У��⼸���Ǻŵ������ǵݼ���
			for (int i = 1; i <= c; i++) {// ѭ����������Խ��Խ�ٵ�����
				for (int h = 1; h<= i; h++) {// ����ո��������ڵ�ǰ������
					System.out.print("  ");
				}
				for (int j = 1; j <= 20; j++) {// ����Ǻţ��������ڣ�����-��ǰ������*2-1
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
