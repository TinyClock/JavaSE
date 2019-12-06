package cn.ouc.MethodReference;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-03 10:34
 **/
public class Husband {
    public void buyHouse() {
        System.out.println("买一套四合院！");
    }

    public void marry(Richable r) {
        r.buy();
    }

    public void soHappy() {
        //1.1 Richable是函数式接口了，可以使用Lambda表达式
        marry(() -> {
            this.buyHouse();
        });

        //1.2 可以是用方法引用简化
        marry(this::buyHouse);

    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
