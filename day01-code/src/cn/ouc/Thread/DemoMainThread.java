package cn.ouc.Thread;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-27 17:00
 **/
public class DemoMainThread {

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        System.out.println(Thread.currentThread().getName());

        DemoRunnable runnable = new DemoRunnable();
        new Thread(runnable).start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();

    }
}
