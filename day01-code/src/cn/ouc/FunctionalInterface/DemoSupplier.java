package cn.ouc.FunctionalInterface;

import java.util.function.Supplier;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 21:41
 **/
public class DemoSupplier {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        System.out.println(getString(() -> "abc"));
    }
}
