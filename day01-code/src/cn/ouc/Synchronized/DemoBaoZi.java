package cn.ouc.Synchronized;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 19:48
 **/
public class DemoBaoZi {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
