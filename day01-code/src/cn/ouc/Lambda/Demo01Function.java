package cn.ouc.Lambda;

import java.util.function.Function;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 11:01
 **/
public class Demo01Function {
    public static void transmit(String s, Function<String, Integer> function) {
        Integer i = function.apply(s);
        System.out.println(i);
    }

    public static void transmit1(String s, Function<String, Integer> f1, Function<Integer, String> f2) {
//        Integer i = f1.apply(s);
//        String s1 = f2.apply(i);

        String s1 = f1.andThen(f2).apply(s);
        System.out.println(s1);
    }

    public static int change(String str, Function<String, String> func1, Function<String, Integer> func2, Function<Integer, Integer> func3) {
        return func1.andThen(func2).andThen(func3).apply(str);
    }

    public static void main(String[] args) {
        String s = "123123";
//        transmit(s, (String s1) -> {
//            return Integer.parseInt(s1);
//        });
        //简化后
        transmit(s, s1 -> Integer.parseInt(s1));

        transmit1(s, s1 -> Integer.parseInt(s1) + 10, i -> i + "");

        String str = "赵丽颖,20";
        int result = change(str, s1 -> s1.split(",")[1], s1 -> Integer.parseInt(s1), i -> i += 100);
        System.out.println(result);
    }
}
