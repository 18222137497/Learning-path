package com.tedu.manystar;

import java.awt.Toolkit;

/**
 * �����ǹ�����
 * ��װ�˹��������Լ�����
 * ���ã������˴���ĸ�����
 * @author 123
 *
 */
public class Factory {
	//��ȡ��Ļ�Ŀ�
	public static int width=Toolkit.getDefaultToolkit().getScreenSize().width;
	//��ȡ��Ļ�ĸ�
	public static int height=Toolkit.getDefaultToolkit().getScreenSize().height;
	//���崰��Ŀ�
	public static int jfwidth=400;
	//���崰��ĸ�
	public static int jfheight=600;
	//����ˮƽ����x����
	public static int jframeX=width/2-jfwidth/2;
	//���㴹ֱ����y����
	public static int jframeY=height/2-jfheight/2;

}
