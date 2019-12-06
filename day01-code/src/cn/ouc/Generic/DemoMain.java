package cn.ouc.Generic;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-25 15:30
 **/
public class DemoMain {

    public static void main(String[] args) {
        DemoGeneric generic = new DemoGenericImpl();
        generic.method("123");
        DemoGeneric generic1 = new DemoGenericImpl2();
        generic1.method(456);
        generic1.method("456");
    }
}
