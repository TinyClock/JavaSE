package cn.ouc.MethodReference;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-03 10:25
 **/
public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man!");
    }

    public void method(Greetable g) {
        g.greet();
    }

    public void show() {
        //1.1 Greetable是函数式接口，可以使用Lambda表达式写法
        method(() -> {
            Human human = new Human();
            human.sayHello();
        });

        //1.2 因为有子父类关系，有关键字Super代表父类，可以直接使用Super调用父类的成员方法，无需新建父类对象
        method(() -> super.sayHello());
        //1.3 可以使用方法引用简化写法
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
