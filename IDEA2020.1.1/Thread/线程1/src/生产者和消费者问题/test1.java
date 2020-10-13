package 生产者和消费者问题;

import java.util.LinkedList;

/**
 * 管程法
 * 信号灯法和管程法的区别就是一个是通过标识位控制，一个是通过变量的值控制
 * 个人感觉区别不是很大，都是判断是否满足条件而已
 */
public class test1 {
    public static void main(String[] args) {
        Behavior Behavior = new Behavior(10);
        new person(Behavior).start();
        new chan(Behavior).start();
    }
}

/**
 * 消费者类
 * 消费者只管消费
 */
class person extends Thread{
    Behavior Behavior;
    public person(Behavior Behavior){
        this.Behavior=Behavior;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Behavior.xiaofei();//消费
        }
    }
}

/**
 * 生产者类
 * 生产者只管生产
 */
class chan extends Thread{
    public chan(Behavior Behavior){
        this.Behavior=Behavior;
    }
    Behavior Behavior;
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Behavior.shengchan();//生产
        }
    }
}

/**
 * 行为类
 */
class Behavior {
    private int size;//设置缓存区最大容量，LinkedList没有容量限制，所以要设置一个最大容量来控制
    LinkedList<Integer> list=new LinkedList<>();//设置缓存区(容纳区)

    public Behavior(int size) {
        this.size = size;
    }

    /**
     * 生产方法
     */
    public synchronized void shengchan (){
       if (list.size()==size){//缓存区满了，就不生产了
           try {
               this.wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       this.notify();
       list.push(1);//生产
       System.out.println("生产了一个，目前有"+list.size());
    }

    /**
     * 消费方法
     */
    public synchronized void xiaofei(){
        if (list.size()==0){//缓存区吃空了，就不吃了
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        list.removeFirst();//吃
        System.out.println("消费者吃了一个，目前"+list.size());
    }
}
