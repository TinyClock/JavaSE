package cn.ouc.Synchronized;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 19:16
 **/
public class DemoWaitAndNotify2 {
    public static void main(String[] args) {
        Object obj = new Object();
//        创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客1告知老板要的包子种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("包子已经做好，顾客1开吃！");
                        System.out.println("-------------------");
                    }
                }
            }
        }.start();

//        创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客2告知老板要的包子种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("包子已经做好，顾客2开吃！");
                        System.out.println("-------------------");
                    }
                }
            }
        }.start();

//      创建一个老板线程
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    //花5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板5s之后做好包子，告知顾客");
//                        obj.notify();
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
