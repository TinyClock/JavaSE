package cn.ouc.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-27 09:35
 **/
public class DemoException {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);

        int[] array = {1,2,3};
        try {
            System.out.println(array[3]);
        }catch (Exception e){
            System.out.println(e.toString());
        }

//        int[] array1 = new int[1024*1024*1024*1024*1024*1024];
        System.out.println();
    }
}
