package cn.ouc.Generic;

public class DemoGenericImpl2<I> implements DemoGeneric<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
