package cn.ouc.Lambda;

import java.util.function.Predicate;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 10:35
 **/
public class DemoPredicateAnd {
    public static boolean checkString(String s, Predicate<String> p1, Predicate<String> p2) {
//        return p1.test(s) && p2.test(s);
        //等价
        return p1.and(p2).test(s);
    }

    public static boolean checkString1(String s, Predicate<String> p1, Predicate<String> p2) {
//        return p1.test(s) || p2.test(s);
        //等价
        return p1.or(p2).test(s);
    }

    public static boolean checkString2(String s, Predicate<String> p1) {
//        return !p1.test(s);
        //等价
        return p1.negate().test(s);
    }


    public static void main(String[] args) {
        String s = "abcde";
//        boolean b = checkString(s, (String s1) -> s1.length() > 5, (String s1) -> s1.contains("a"));
        boolean b = checkString(s, s1 -> s1.length() > 5, s1 -> s1.contains("a"));
        System.out.println(b);

        boolean c = checkString1(s, s1 -> s1.length() > 5, s1 -> s1.contains("a"));
        System.out.println(c);

        boolean d = checkString2(s, s1 -> s1.length() > 5);
        System.out.println(d);
    }
}
