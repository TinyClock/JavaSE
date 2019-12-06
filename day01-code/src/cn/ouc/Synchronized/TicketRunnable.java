package cn.ouc.Synchronized;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 解决线程安全问题的一种方案:使用同步代码块
 * 格式：
 * synchronized(锁对象){
 * 可能会出现线程安全问题的代码（访问了共享数据的代码）
 * }
 * <p>
 * 解决线程安全问题的二种方案:使用同步方法
 * 使用步骤：
 * 1.把访问了共享数据的代码抽取出来，放到一个方法中
 * 2.在方法上添加synchronized修饰符
 * <p>
 * 解决线程安全问题的三种方案：Lock接口
 * Lock接口中的方法：
 * lock();
 * unlock();
 * 使用步骤:
 * 1.在成员位置创建- -个ReentrantLock对象
 * 2.在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
 * 3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 15:20
 **/
public class TicketRunnable implements Runnable {
    private static int ticket = 100;
    //锁对象
    Object object = new Object();
    //1.在成员位置创建- -个ReentrantLock对象
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            方法1：同步代码块
//            synchronized (object) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在销售第" + ticket + "张票!");
//                    ticket--;
//                }
//            }

//            方法2：同步方法
//            saleTicket();

//            方法3：Lock接口
            //2.在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在销售第" + ticket + "张票!");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
                    lock.unlock();
                }
            }
        }
    }

    /*
        定义一个同步方法
        同步方法的锁对象是实现类对象 new TicketRunnable();
        也就是 this
     */
//    public synchronized void saleTicket(){
//        if (ticket > 0) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在销售第" + ticket + "张票!");
//            ticket--;
//        }
//    }
    /*
        静态的同步方法锁对象不是this
        而是本类的class属性，class文件对象（反射）
     */
//    public static synchronized void saleTicket(){
//        if (ticket > 0) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在销售第" + ticket + "张票!");
//            ticket--;
//        }
//    }

    /*
        使用本类的class属性作为锁对象
     */
    public static /*synchronized*/ void saleTicket() {
        synchronized (TicketRunnable.class) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在销售第" + ticket + "张票!");
                ticket--;
            }
        }
    }


}
