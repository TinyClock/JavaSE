package cn.ouc.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 13:15
 **/
public class How2JExercise03 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("今天是：" + sdf.format(date));
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        //下个月倒数第三天
        //原日期增加2个月
        c.add(Calendar.MONTH, 2);
        //设置为当月第一天
        c.set(Calendar.DATE, 1);
        //减少3天
        c.add(Calendar.DATE, -3);
        System.out.println("下个月倒数第三天是：" + sdf.format(c.getTime()));

        c.setTime(date);
        c.add(Calendar.MONTH,2);
        c.set(Calendar.DATE,-2);
        System.out.println("下个月倒数第三天是：" + sdf.format(c.getTime()));
    }
}
