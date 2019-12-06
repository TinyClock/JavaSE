package cn.ouc.Generic;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-25 10:19
 **/
public class DemoGenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public static void main(String[] args) {
        DemoGenericClass gc = new DemoGenericClass();
        gc.setName("12345");
        System.out.println(gc.getName());

        DemoGenericClass<Integer> gc2 = new DemoGenericClass<>();
        gc2.setName(1);
        System.out.println(gc2.name);
    }
}
