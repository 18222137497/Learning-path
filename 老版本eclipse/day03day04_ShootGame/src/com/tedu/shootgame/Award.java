package com.tedu.shootgame;
/**
 * �����ӿڣ�
 *  ˫������
 *  ����ֵ
 * @author 123
 *
 */
public interface Award {
	/*
	 * ���影������
	 * �������ֵ������ֵ
	 * �����������������0��1��ɽ�������
	 *  0 ˫������ֵ
	 *  1 ����ֵ
	 */
	public int DOUBLE_FIRE=0;//����
	public int LIFE=1;//����ֵ
	/*�ṩ��ȡ�����ķ���*/
	public int getAwardType();
}
