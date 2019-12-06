package cn.ouc.MethodReference;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-03 10:50
 **/
public class DemoPerson {
    public static void method(String name, PersonBuilder p) {
        Person person = p.builder(name);
        System.out.println(person.toString());
    }

    public static void main(String[] args) {
        //1.1 Lambda表达式
        method("小明", (String name) -> {
            return new Person(name);
        });

        //1.2 使用方法引用优化
        method("小红", Person::new);
    }
}
