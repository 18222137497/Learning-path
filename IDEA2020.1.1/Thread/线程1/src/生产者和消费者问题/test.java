package 生产者和消费者问题;

/**
 * 信号灯法
 */
public class test {
    public static void main(String[] args) {
        TV tv = new TV("娱乐节目");
        new Actor(tv).start();
        new People(tv).start();
    }
}

/**
 * 演员类
 */
class Actor extends Thread{
    TV tv;
    public Actor(TV tv){
        this.tv=tv;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            tv.act();
        }
    }
}

/**
 * 观众类
 */
class People extends Thread{
    TV tv;
    public People(TV tv){
        this.tv=tv;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            tv.lock();
        }
    }
}

/**
 * 电视类
 */
class TV{
    private String program;//演出的节目名称
    private boolean have=false;//标志位，是否有节目可以看

    public TV(String program) {
        this.program = program;
    }

    public synchronized void act(){
        if (have){//有就不演
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        have=true;//演了就有节目了
        System.out.println("演员演出了"+program);
    }
    public synchronized void lock(){
        if (!have){//没有就不看
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        have=false;//看了就没节目了
        System.out.println("观众观看了"+program);
    }
}

