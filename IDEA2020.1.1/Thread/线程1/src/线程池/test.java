package 线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 线程池专讲
 */
public class test {
    public static void main(String[] args) {
        //阻塞队列
        /**
         * workQueue： 一个阻塞队列(何为阻塞队列，后续会用一篇文章进行讲解)，用来存储等待执行的任务，这个参数的选择也很重要，会对线程池的运行过程产生重大影响，一般来说，这里的阻塞队列有以下几种选择：
             * SynchronousQueue：直接提交队-列，该队列没有缓存，任务来了直接提交上去。该队列容易执行拒绝策略。
             * ArrayBlockingQueue: 有界队列，当有新任务执行时，若有空闲线程，则优先执行任务，若线程池已满，则任务加入到队列中，等待线程池有空闲线程。
             * LinkedBlockingQueue:无界队列，除非系统资源耗尽，否则不会出现任务入队失败的情况。缺点就是当处理速度跟不上任务创建的速度的时候，很容易出现系统内存耗尽的情况
             * PriorityBlockingQueue:优先任务队列，这是个特殊的队列，该队列可以根据任务自身的优先级顺序先后执行，确保系统性能的同时，还能有很好的质量保证(其他队列是先进先出处理任务的，该队列可以由优先级处理任务)
         */
        //拒绝策略
        /**
         * 首先：我们从一二章可以看出，无论是有界队列还是无界队列，实际上，如果创建任务的队列比处理任务的速度快很多，系统资源还是很容易被消耗完的，假如没有相关措施，那么很多时候，该系统就是不完善的，那如何解决呢，其实，这个问题就是本章要学的：拒绝策略。
         * 其次： RejectedExecutionHandler从名字上就可以看出，翻译过来就是拒绝提交执行者，也就是，拒绝策略用到的，就是RejectedExecutionHandler这个接口的实现类，目前内置的拒绝策略(实现RejectedExecutionHandler接口)如下：
         *
         * AbortPolicy
         * 该策略直接抛异常，阻止系统正常的工作
         * CallerRunsPolicy
         * 只要线程池未关闭，该策略直接在调用者线程中，运行当前被丢弃的任务。显然这样做不会真的丢弃任务，但任务提交线程的性能极有可能会急剧下降。
         * DiscardOldestPolicy
         * 该策略将丢弃最老的一个请求，也就是即将被执行的一个任务，并尝试再次提交当前任务。
         * DiscardPolicy
         * 该策略默默地丢弃无法处理的任务，不予任何处理，如果允许任务丢失，我觉得这可能是最好的一种方案吧。
         * 当然，如果以上均无法满足我们的请求，我们可以自己实现RejectedExecutionHandler接口的。
         */
        System.out.println("1");
    }
}
