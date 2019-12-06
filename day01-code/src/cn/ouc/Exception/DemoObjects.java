package cn.ouc.Exception;

import java.util.Objects;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-27 09:53
 **/
public class DemoObjects {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object obj) {
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"kong");
    }
}
