package cn.ouc.Synchronized;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 16:09
 **/
public class DemoWaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
//      创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj){
                        System.out.println("告知老板要的包子种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("包子已经做好，开吃！");
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
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
