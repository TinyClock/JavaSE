package cn.ouc.Thread;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 15:20
 **/
public class TicketRunnable implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在销售第" + ticket + "张票!");
            ticket--;
        }
    }
}
