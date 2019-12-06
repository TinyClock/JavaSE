package cn.ouc.MethodReference;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Map;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-02 14:18
 **/
public class Demo01Printable {
    public static void print(Printable p) {
        p.print("HelloWorld");
    }

    public static int method(int number, Calcable c) {
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        print(s -> System.out.println(s));
        print(System.out::println);

        //1.1使用Lambda表达式调用成员方法
        print(s -> {
            MethodRerObject methodRerObject = new MethodRerObject();
            methodRerObject.printUpperCase(s);
        });
        //1.2使用方法引用简化写法
        print(new MethodRerObject()::printUpperCase);

        //2.1使用Lambda表达式调用Math的静态方法abs
        System.out.println(method(10, n -> Math.abs(n)));
        //2.2使用方法引用调用Math的静态方法abs
        System.out.println(method(10, Math::abs));


    }
}
