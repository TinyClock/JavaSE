package cn.ouc.Synchronized;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 19:44
 **/
public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (!bz.isFlag()) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行的代码
                System.out.println("吃货正在吃：" + bz.getPi() + bz.getXian() + "包子");
                bz.setFlag(false);
                //吃货线程唤醒包子铺线程生成包子
                bz.notify();
                System.out.println("吃货已经吃完：" + bz.getPi() + bz.getXian() + "包子,包子铺开始生成包子");
                System.out.println("-----------------------------------------");
            }
        }
    }
}
