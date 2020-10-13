package 生产者和消费者问题;

import java.util.LinkedList;

/**
 * 管程法
 * 生产者消费者问题
 */
public class test2 {
    //最大容量
    public static final int MAX_SIZE = 2;
    //存储媒介
    public static LinkedList<Integer> list = new LinkedList<>();

    /**
     * 生产者
     */
    class Producer implements Runnable {
        @Override
        public void run() {
            synchronized (list) {
                //仓库容量已经达到最大值
                while (list.size() == MAX_SIZE) {
                    System.out.println("仓库已满，生产者" + Thread.currentThread().getName() + "不可生产.");
                    try {
                        //todo
                        // 这个对象.wait就是让当前线程等待，这个list只是一个类似于表示的东西，
                        // 因为同步代码块将这个锁对象拿到当前线程，所以这个对象成为了该线程私有，所以这个对象的.wait方法就是让当前对象等待
                        // wait和notify都是Object中的方法
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(1);
                System.out.println("生产者" + Thread.currentThread().getName() + "生产, 仓库容量为" + list.size());
                list.notify();
            }
        }
    }

    /**
     * 消费者
     */
    class Consumer implements Runnable {

        @Override
        public void run() {
            synchronized (list) {
                while (list.size() == 0) {
                    System.out.println("仓库为空，消费者" + Thread.currentThread().getName() + "不可消费.");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.removeFirst();
                System.out.println("消费者" + Thread.currentThread().getName() + "消费，仓库容量为" + list.size());
                list.notify();
            }
        }
    }

    /**
     * 执行类
     * @param args
     */
    public static void main(String[] args) {
        test2 proAndCon = new test2();
        Producer producer = proAndCon.new Producer();
        Consumer consumer = proAndCon.new Consumer();

        for (int i = 0; i < 10; i++) {
            Thread pro = new Thread(producer);
            pro.start();
            Thread con = new Thread(consumer);
            con.start();
        }
    }

}
