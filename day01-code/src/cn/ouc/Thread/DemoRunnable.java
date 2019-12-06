package cn.ouc.Thread;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 09:56
 **/
public class DemoRunnable implements Runnable {

    public DemoRunnable() {
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
