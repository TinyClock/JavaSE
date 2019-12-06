package cn.ouc.Lambda;

import java.util.function.Predicate;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 10:30
 **/
public class DemoPredicate {
    public static boolean checkString(String s, Predicate<String> p) {
        return p.test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";
        boolean b = checkString(s, s1 -> s1.length() > 5);
        System.out.println(b);
    }
}
