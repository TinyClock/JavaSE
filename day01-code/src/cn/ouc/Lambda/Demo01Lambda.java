package cn.ouc.Lambda;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 20:19
 * Lambda表达式的标准格式：
 * 三部分组成：
 * 1、一些参数
 * 2、一个箭头
 * 3、一段代码
 * 格式：
 * （参数列表）->{一些重写方法的代码};
 *  ():接口中抽象方法的参数列表，没有参数，就空着；有参数就写出参数，多个参数使用逗号分隔
 *  ->：将参数传递给方法体
 *  {}：重写的方法体
 **/
public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();

    }
}
