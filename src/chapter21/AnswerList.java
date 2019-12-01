package chapter21;

import org.junit.jupiter.api.Test;
import utils.P;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 21章：并发
 * 1.Java的线程机制是抢占式的，这表示调度机制会周期性地中断线程，将上下文切换到另一个线程
 * 2.一个线程就是在进程中的一个单一的顺序控制流，因此，单个进程可以拥有多个并发执行的任务
 * 3.方式一：实现Runable接口，并编写run方法
 * 4.Thread.yild()是对线程调度器的一种建议，建议CPU将一个线程转移到另一个
 * 5.Runable需要交给一个Thread来执行。Thread构造器需要一个Runable对象。调用Thread对象的start()方法为该线程执行必须的初始化操作，之后Thread会自动执行Runable的run方法
 * 6.线程的调度机制是非确定的
 * 7.一个线程会创建一个单独的执行线程，在对start()的调用完成之后，它仍旧会继续存在
 * 8.java.util.concurrent包中的执行器（Executor）会管理对象
 * 9.通常，单个的Executor被用来创建和管理系统中所有的任务
 * 10.shutdown()方法的调用可以防止新任务被提交给这个Executor
 * 11.CachedThreadPool、FixedThreadPool(使用有限的进程集)、SingleThreadPool(线程数量为1的FixedThreadPool)
 * 12.Runable是执行工作的独立任务，不返回任何值。Callable接口可以，我们要实现Call方法，并返回值，并且必须通过ExecutorService.submit()方法调用它
 *    submit方法返回Future对象，siDone()方法可以查询Future对象是否已完成
 * 13.休眠的方法：Thread.sleep()、TimeUnit.MILLISECONDS.sleep()
 * 14.异常不能跨线程传播回main()
 * 15.线程的优先级将该线程的重要性传递给了调度器。优先级不会导致死锁。优先级较低的线程仅仅是执行的频率较低。
 * 16.在线程启动之前调用setDeamon()方法，将它设置为后台线程。
 * 17.调用isDeamon()确定线程是否是一个后台线程。如果是一个后台线程，那么它创建的任何线程都将被自动设置成后台线程
 * 18.当最后一个非后台线程终止时，后台线程会突然终止
 * 19.方式二：继承Thread(不能再继承类了)
 * 20.通过自管理的方式（实现Runable，继承其他类，将类传递给Thread），可以实现使用Thread的同时还能继承其他类
 * 21.一个线程可以在其他线程之上调用join方法，程序会等待新加入的线程执行完再执行。对join()方法的调用可以用interrupt()来中断
 * 22.THread.UncaughtExceptionHandler，允许在每个Thread对象上都带一个异常处理器。其中的uncaughtException()会在线程因未捕获的异常在临近死亡时被调用
 * 23.在Java中递增不是原子性的操作
 * 24.防止冲突的方法就是当资源被一个任务使用时在其上加锁
 * 25.关键字synchronized是Java防止资源冲突提供的内置支持
 * 26.在使用并发是将域设置未private非常重要，否则synchronized关键字就不能防止其他任务直接访问域。
 * 27.Brian同步规则：如果你正在写一个变量，它可能接下来将被另一个线程读取，或者正在读取一个上一次已经被另一个线程写过的变量，那么你必须使用同步，并且，读写线程都必须使用相同的监视器索同步
 * 28.每个访问临界资源的方法都必须被同步
 * 29.使用显式的Lock对象，与内建的锁相比，代码缺乏优雅性，但更灵活
 * 30.一般不要根据原子性来编写不需要同步控制的代码。
 * 31.如果一个域声明未volatile的，那么只要对这个域产生了写操作，那么所有的读操作都可以看到这个修改
 * 32.当一个域的值依赖于它之前的值时，volatile就无法工作了
 * 33.使用volatile而不是synchronized的唯一安全的情况是类中只有一个可变的域
 * 34.如果一个域可能被多个任务同时访问，或者这些任务中至少有一个是写入任务，那么就应该将这个域设为volatile的
 * 35.原子类AtomicInteger、AtomicLong、AtomicReference（一般不建议使用）
 * 36.同步块synchronized(syncObject){}
 * 37.模板方法：一些基础功能在基类中实现，并且其一个或多个抽象方法在派生类中定义
 * 38.synchronized(this)获得了块锁，且该对象其他的synchrnized方法和临界区就不能被调用了
 * 39.防止任务在共享资源上产生冲突的第二种方式是根除对变量的共享，THreadLocal对象通常当作静态域存储
 * 40.线程的4中状态：新建、就绪、阻塞、死亡
 * 41.任务进入阻塞状态的原因：调用sleep进入休眠、调用wait使线程挂起、等待某个输入/输出、试图调用某个被锁的对象
 * 42.调用Thread.interrupt会抛出InterruptedException异常
 * 43.能够中断对sleep的调用(或者任何要求抛出InterruptedException的调用),但是不能中断正在试图获取synchroniezed锁或者试图执行I/O操作的线程
 * 44.java SE5加的特性：在ReentranLock上阻塞的任务具有可以被中断的能力
 * 45.wait可以使程序挂起，通过notify()或notifyAll()唤醒
 * 44.调用sleep的时候锁并没有被释放，yield()也一样；然而，调用wait()将释放锁
 * 45.wait()、notify()、notifyAll()是Object的方法，只能在同步块或同步方法里调用；sleep是Thread的方法，可以在同步或非同步块里调用
 * 46.Java SE5中还可以用signal、signalAll来唤醒wait
 * 47.同步队列：BlockingQueue、LinkedBlockedQueue、ArrayBlockingQueue
 * 48.任务间用PipedWriter、PipedReader管道进行输入输出
 * 49.死锁的典型问题：哲学家就餐问题
 * 50.死锁需要满足的4个条件：1.互斥条件  2.持有资源还在等待资源  3.资源不能被抢占  4.必须有循环等待（最容易破坏的条件）
 * 51.Java SE5提供的新并发类：CountDownLatch、CyclicBarrier、DelayQueue、PriorityBlockingQueue
 * 52.乐观锁：乐观的人认为资源不存在竞争，不加锁
 *    悲观锁；悲观的人认为总会有人竞争资源，加锁
 *    乐观锁的应用（比较和替换是一个原子操作）：CAS(compare and swap)、版本号机制（更新版本号的时候发现和读取时版本号不一致则更改失败）
 *    乐观锁的缺点：ABA问题（在读取后，值由A变为B又变回A,我们会认为没变）、循环时间长开销大、只能保证一个共享变量的原子操作
 */
public class AnswerList {

    @Test
    public void test01(){
        for (int i = 0; i < 10; i++) {
            new Thread(new HelloThread()).start();
        }
    }

    @Test
    public void test02() {
//        for (int i = 1; i < 100; i+=5) {
//            new Thread(new Fibonacci(i)).start();
//        }
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 1; i < 100; i+=5) {
            exec.execute(new Fibonacci(i));
        }
        exec.shutdown();
    }

    @Test
    public void test05() {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> results = new ArrayList<>();
        for (int i = 1; i < 50; i+=5) {
            results.add(exec.submit(new CallableFibonacciSum(i)));
        }

        for (Future<Integer> fs : results) {
            try {
                P.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {

    }
}
