package cn.ouc.Generic;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-25 15:27
 **/
public class DemoGenericImpl implements DemoGeneric<String> {

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
