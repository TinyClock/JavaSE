package cn.ouc.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 12:09
 **/
public class How2JExercise01 {

    public static void main(String[] args) throws ParseException {
        //借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String str1 = "1995.1.1 00:00:00";
        String str2 = "1995.12.31 23:59:59";
        Date date1 = sdf.parse(str1);
        Date date2 = sdf.parse(str2);

        long time = date1.getTime() + (long) ((date2.getTime() - date1.getTime()) * Math.random());
        Date date3 = new Date(time);

        System.out.println("1995年第一天 " + date1.toString());
        System.out.println("1995年最后一天 " + date2.toString());
        System.out.println("1995年这一年中的一个随机时间" + date3);
    }
}
