package API�ڶ�����;

import java.util.Arrays;

/**
 * System ϵͳ��
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * 					��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
 * 		������
 * 			src - Դ���顣
 *			srcPos - Դ�����е���ʼλ�á�
 *			dest - Ŀ�����顣
 *			destPos - Ŀ�������е���ʼλ�á�
 *			length - Ҫ���Ƶ�����Ԫ�ص�������
 * @author 123
 *
 */
public class TextSystem {
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5};
		int[] brr= {9,8,7,4,5,6};
		System.out.println(Arrays.toString(brr));//����ǰ
		System.arraycopy(arr, 0, brr, 0, 3);//��ԭ�����ǰ����Ԫ�ظ��Ƶ�Ŀ�������ǰ����λ����
		System.out.println(Arrays.toString(brr));
		
		
	}
}
