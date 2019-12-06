package cn.ouc.FunctionalInterface;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 21:24
 **/
public class Demo {
    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImpl());
        show(()-> System.out.println("123123"));
    }

    private static void show(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.method();
    }


}
