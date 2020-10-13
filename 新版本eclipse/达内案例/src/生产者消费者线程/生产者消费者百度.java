package 生产者消费者线程;

import java.util.LinkedList;

public class 生产者消费者百度 {
    public static void main(String[] args){
        Storage st = new Storage();

        Producer p1 = new Producer(10, st);
        Producer p2 = new Producer(80, st);

        Consumer c1 = new Consumer(40, st);
        Consumer c2 = new Consumer(70, st);

        new Thread(c1, "消费者1").start();
        new Thread(c2, "消费者2").start();
        new Thread(p1, "生产者2").start();
        new Thread(p2, "生产者2").start();
    }
}
class Storage{
    private static final int MAX = 100;
    LinkedList<Object> list = new LinkedList<>();

    public void produce(int num) throws Exception{
        synchronized(list){
            while(list.size() + num > MAX){
                System.out.println("仓库太小，生产装不下!!");
                list.wait();
            }
            for(int i=0; i<num; i++)
                list.add(new Object());
            System.out.println("生产了---" + num);
            list.notifyAll();
        }
    }
    public void consume(int num) throws Exception{
        synchronized(list){
            while(list.size() < num){
                System.out.println("仓库的库存不够");
                list.wait();
            }
            for(int i=0; i<num; i++)
                list.remove();
            System.out.println("消费了---" + num);
            list.notifyAll();
        }
    }
}

class Producer implements Runnable{
    private int num;
    private Storage storage;
    public Producer(int num, Storage storage){
        this.num = num;
        this.storage = storage;
    }
    public void produce(){
        try{
            storage.produce(num);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        produce();
    }
}

class Consumer implements Runnable{
    private int num;
    private Storage storage;
    public Consumer(int num, Storage storage){
        this.num = num;
        this.storage = storage;
    }
    public void consume(){
        try{
            storage.consume(num);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        consume();
    }
}




