package 线程的创建;

import java.util.concurrent.*;

/**
 * 线程池创建线程
 */
public class MyThread2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("自定义线程"));
        //todo 这里列出四个线程池创建线程的方法
        /**
         * 第一种：ExecutorServer newCachedThreadPool()  todo 这个一般是最好用的也是最普遍常用的
         *  -缓存型池子，先查看池中有没有以前建立的线程，如果有就重用.如果没有就建一个新的线程加入池中
         *  -缓存型池子通常用于执行一些生存期很短的异步型任务
         *      因此在一些面向连接的daemon型SERVER中用得不多。但对于生存期短的异步任务，它是Executor的首选。
         *  -能重用的线程，必须是timeout IDLE内的池中线程，
         *      缺省timeout是60s,超过这个IDLE时长，线程实例将被终止及移出池。
         *      注意，放入CachedThreadPool的线程不必担心其结束，超过TIMEOUT不活动，其会自动被终止。
         *
         *  ExecutorServer newCachedThreadPool(ThreadFactory threadFactory)
         *  -可以传参！这个方法有一个重写方法，参数是一个ThreadFactory线程工厂，这样就可以指定需要建立的线程任务了
         */
        ExecutorService executorService = Executors.newCachedThreadPool();//没有参数需要后面调用execute方法执行线程
        Executors.newCachedThreadPool((runnable)->thread);//不够用会自动创建一个线程
        /**
         * 第二种：ExecutorServer newFixedThreadPool(int nThreads)  todo 一般用户服务器类型的线程池，活动的线程数固定，也会自己创建线程，但是多出的线程执行完成之后就会被移出线程池，并且没有IDLE，不会自己终止
         * -newFixedThreadPool与cacheThreadPool差不多，也是能重用就用，但不能随时建新的线程
         * -其独特之处:任意时间点，最多只能有固定数目的活动线程存在，此时如果有新的线程要建立，只能放在另外的队列中等待，直到当前的线程中某个线程终止直接被移出池子
         * -和cacheThreadPool不同，FixedThreadPool没有IDLE机制（可能也有，但既然文档没提，肯定非常长，类似依赖上层的TCP或UDP IDLE机制之类的），所以FixedThreadPool多数针对一些很稳定很固定的正规并发线程，多用于服务器
         * -从方法的源代码看，cache池和fixed 池调用的是同一个底层池，只不过参数不同:
         * fixed池线程数固定，并且是0秒IDLE（无IDLE）
         * cache池线程数支持0-Integer.MAX_VALUE(显然完全没考虑主机的资源承受能力），60秒IDLE
         *
         * ExecutorServer newFixedThreadPool(int nThreads,ThreadFactory threadFactory) 也可以自定义线程工厂
         */
        Executors.newFixedThreadPool(3);//没有参数需要后面调用execute方法执行线程
        Executors.newFixedThreadPool(3,(s)->thread);//指定线程工厂
        /**
         * 第三种：ScheduledExecutorService newSingleThreadExecutor(int corePoolSize)
         * -调度型线程池
         * -这个池子里的线程可以按schedule(时间表)依次delay(延迟)执行，或周期执行
         *
         * ScheduledExecutorService newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory) 也可以指定工厂
         */
        Executors.newScheduledThreadPool(3);//参数为保留在线程池中的线程，即使死亡页存在
        Executors.newScheduledThreadPool(3,(s)->thread);
        /**
         * 第四种：ExecutorService newSingleThreadExecutor()
         * -单例线程，“任意时间”池中只能有一个线程
         * -用的是和cache池和fixed池相同的底层池，但线程数目是1,0秒IDLE（无IDLE）
         * 也可以传线程工厂
         */
        Executors.newSingleThreadExecutor();
        Executors.newSingleThreadExecutor((s)->thread);

        /*todo  下面是线程池执行Runnable接口和Callable接口的方式  我们随便使用一个线程池作为例子
            这里执行的线程对象并不是指定工厂创建的线程，而是ExecutorService接口中的方法，或者Executor接口中的方法，
            因为ExecutorService接口继承Executor接口，所以一并用ExecutorService操作
        */
        /**
         * 执行Runnable线程
         * 这个execute方法是executeServer的父类Execute中的方法
         * 而ExecutorService中也有执行Runnable的方法
         */
        executorService.execute(()-> System.out.println(""));
        executorService.submit(()-> System.out.println(""));
        Future<String> submit1 = executorService.submit(() -> System.out.println(""), "");//甚至可以给Runnable执行之后强行附加一个返回值，这个返回值只是自己定义的一个对象而已，只有调用get方法才能获取到
        try {
            String s = submit1.get();//这个返回值类型是自己定义的Future<T>的泛型
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        /**
         * 执行Callable线程
         */
        Future<String> submit = executorService.submit(() -> "");//这个submit没有指定返回值的参数，因为Callable自己带有返回值

        //todo 四种创建线程的方法对比
        /**
         * 实现Runnable和实现Callable接口的方式基本相同，不过是后者执行call()方法有返回值，后者线程执行体run()方法无返回值，因此可以把这两种方式归为一种这种方式与继承Thread类的方法之间的差别如下：
         *
         * 1、线程只是实现Runnable或实现Callable接口，还可以继承其他类。
         *
         * 2、这种方式下，多个线程可以共享一个target对象，非常适合多线程处理同一份资源的情形。
         *
         * 3、但是编程稍微复杂，如果需要访问当前线程，必须调用Thread.currentThread()方法。
         *
         * 4、继承Thread类的线程类不能再继承其他父类（Java单继承决定）。
         *
         * 5、前三种的线程如果创建关闭频繁会消耗系统资源影响性能，而使用线程池可以不用线程的时候放回线程池，用的时候再从线程池取，项目开发中主要使用线程池
         */
    }
}
