package cn.ouc.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 10:23
 **/
public class DemoDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(date);
        System.out.println(sdf.format(date));
        System.out.println(sdf1.format(date));
        String str = sdf1.format(date);

        try {
            Date date1 = sdf1.parse(str);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
