package cn.ouc.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 10:31
 **/
public class How2JExercise02 {
    public static void main(String[] args) throws ParseException {
        Date[] dates = new Date[9];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String str = "2000";
        Date date = sdf.parse(str);
        long bound = date.getTime();
        for (int i = 0; i < 9; i++) {
            dates[i] = new Date((long) (Math.random() * bound));
        }

        System.out.println("得到的随机日期数组：");
        for (Date tDate : dates) {
            System.out.println(tDate);
        }

        Arrays.sort(dates, (o1, o2) -> {
            SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
            char[] chars1 = sdf1.format(o1).toCharArray();
            char[] chars2 = sdf1.format(o2).toCharArray();
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i]) {
                    return chars1[i] - chars2[i];
                }
            }
            return 0;
        });

        System.out.println("排序后的随机日期数组：");
        for (Date tDate : dates) {
            System.out.println(tDate);
        }
    }
}
