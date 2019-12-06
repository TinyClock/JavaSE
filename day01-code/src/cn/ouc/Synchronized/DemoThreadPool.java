package cn.ouc.Synchronized;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: JDK1.5之后 java.util.concurrent.Executors 线程池的工厂类，用来生产线程池
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 20:01
 **/
public class DemoThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
    }
}

class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 创建了一个新的线程");

    }
}
