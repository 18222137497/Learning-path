package API第二部分;

import java.util.Arrays;

/**
 * System 系统类
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * 					从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 * 		参数：
 * 			src - 源数组。
 *			srcPos - 源数组中的起始位置。
 *			dest - 目标数组。
 *			destPos - 目标数据中的起始位置。
 *			length - 要复制的数组元素的数量。
 * @author 123
 *
 */
public class TextSystem {
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5};
		int[] brr= {9,8,7,4,5,6};
		System.out.println(Arrays.toString(brr));//复制前
		System.arraycopy(arr, 0, brr, 0, 3);//将原数组的前三个元素复制到目标数组的前三个位置上
		System.out.println(Arrays.toString(brr));
		
		
	}
}
