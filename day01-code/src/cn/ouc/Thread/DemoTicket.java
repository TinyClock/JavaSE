package cn.ouc.Thread;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 15:14
 **/
public class DemoTicket {
    public static void main(String[] args) {
        TicketRunnable ticketRunnable = new TicketRunnable();
        Thread t0 = new Thread(ticketRunnable);
        Thread t1 = new Thread(ticketRunnable);
        Thread t2 = new Thread(ticketRunnable);

        t0.start();
        t1.start();
        t2.start();

    }
}
