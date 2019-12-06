package cn.ouc.reflect;

import java.lang.reflect.Method;

/**
 * @description:
 * 3、获取成员方法
 *
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 19:04
 **/
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        eat_method2.invoke(p,"饭");

        System.out.println("----------------");
        //获取所有public修饰的方法，包括父类Object里的public方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }

        System.out.println(personClass.getName());
    }
}
