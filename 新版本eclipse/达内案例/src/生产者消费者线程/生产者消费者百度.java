package �������������߳�;

import java.util.LinkedList;

public class �����������߰ٶ� {
    public static void main(String[] args){
        Storage st = new Storage();

        Producer p1 = new Producer(10, st);
        Producer p2 = new Producer(80, st);

        Consumer c1 = new Consumer(40, st);
        Consumer c2 = new Consumer(70, st);

        new Thread(c1, "������1").start();
        new Thread(c2, "������2").start();
        new Thread(p1, "������2").start();
        new Thread(p2, "������2").start();
    }
}
class Storage{
    private static final int MAX = 100;
    LinkedList<Object> list = new LinkedList<>();

    public void produce(int num) throws Exception{
        synchronized(list){
            while(list.size() + num > MAX){
                System.out.println("�ֿ�̫С������װ����!!");
                list.wait();
            }
            for(int i=0; i<num; i++)
                list.add(new Object());
            System.out.println("������---" + num);
            list.notifyAll();
        }
    }
    public void consume(int num) throws Exception{
        synchronized(list){
            while(list.size() < num){
                System.out.println("�ֿ�Ŀ�治��");
                list.wait();
            }
            for(int i=0; i<num; i++)
                list.remove();
            System.out.println("������---" + num);
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




