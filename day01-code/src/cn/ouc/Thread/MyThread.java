package cn.ouc.Thread;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 09:31
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
