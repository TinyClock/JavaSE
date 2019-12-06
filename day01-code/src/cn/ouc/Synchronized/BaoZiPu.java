package cn.ouc.Synchronized;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 19:33
 **/
public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.isFlag()) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    //生成薄皮的三鲜馅包子
                    bz.setPi("薄皮");
                    bz.setXian("三鲜馅");
                } else {
                    //生成冰皮牛肉大葱馅
                    bz.setPi("冰皮");
                    bz.setXian("牛肉大葱馅");
                }
                count++;
                System.out.println("包子铺正在生成" + bz.getPi() + bz.getXian() + "包子");
                //生成包子需要3秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.setFlag(true);
                //唤醒吃货线程，让吃货线程池包子
                bz.notify();
                System.out.println("包子铺已经生成好"+bz.getPi() + bz.getXian() + "包子,可以开始吃了");
            }
        }
    }
}
