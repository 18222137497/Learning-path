package com.tarena.yadx.interfaceimp;
/**
 *�ӿ�ʾ��
 * @author 123
 *
 */
public interface Runner {
	/*
	 * ͨ��infterface�ؼ��ֶ���ӿ�
	 * - �ӿ��в��ܶ����Ա�����������Զ��峣��static fianl ���Σ��ؼ���
	 */
	public static int SCORE=100;//�ӿ��ж���ĳ�Ա����һ���ǳ���
	int LEFT=100;
	static final int RIGHT=100;
	public void run();
	public abstract void run1();
	/*
	 * �ӿ���ֻ�ܶ���û�з�����ķ���-���󷽷�
	 * absteract�ؼ��ֿ���ʡ��
	 */
	
}
