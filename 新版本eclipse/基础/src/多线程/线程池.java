package ���߳�;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK1.5֮����ӵ��̳߳�
 * java.util.concurrent.Executors:�̳߳صĹ����࣬�������̳߳�
 * Executors���еľ�̬������
 * 	static ExecutorService newFixedThreadPool(int nThreads)����һ�������ù̶��߳������̳߳�
 * 	������	�����̵߳ĸ���
 * 	����ֵ��	ExecutorService�ӿڣ����ص���ExecutorService�ӿڵ�ʵ����������ǿ���ʹ��ExecutorService�ӿڽ��գ�����ӿڱ�̣�
 * java.util.concurrent.ExecutorService���̳߳ؽӿ�
 * 	�������̳߳��л�ȡ�̣߳�����start������ִ���߳�����
 * 		submit(Runnable task)�ύһ��Runnable��������ִ��
 * 	�ر�/�����̵߳ķ���
 * 		void shutdown()
 * @author 123
 *
 */
public class �̳߳� {	
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println("111111");				
			}
		});
		es.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println("222222");				
			}
		});
		es.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println("333333");				
			}
		});
	}
}
