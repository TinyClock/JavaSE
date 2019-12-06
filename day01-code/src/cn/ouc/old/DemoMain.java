package cn.ouc.old;

public class DemoMain {
    public static void main(String[] args) {
        String str;

        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("这里是一个局部内部类，匿名内部类！");
            }
        };

        myInterface.method();

        new MyInterface() {

            @Override
            public void method() {
                System.out.println("这里是匿名内部类，匿名对象使用该方法！");
            }
        }.method();

    }
}

interface MyInterface {

    void method();
}