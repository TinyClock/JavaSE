package cn.ouc.annotation.demo;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-05 15:33
 **/
public class Calculator {
    //加法
    @Check
    public void add() {
        String str = null;
        str.toString();
        System.out.println("1+0=" + (1 + 0));
    }

    @Check
    public void sub() {
        System.out.println("1-0=" + (1 - 0));
    }

    @Check
    public void div() {
        System.out.println("1/0=" + 1 / 0);
    }

    public void show() {
        System.out.println("没有bug");
    }

}
