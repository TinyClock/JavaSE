package cn.ouc.reflect;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.stream.Stream;

/**
 * @description:
 *  1、获取类中属性的方法
 *  1.1 Field[] getFields();获取所有public修饰的属性
 *  1.2 Field getField(String name);按名字获取public修饰的属性
 *  1.3 Field[] getDeclaredFields():获取所有成员变量，不考虑修饰符
 *  1.4 Field getDeclaredField(String name);按名字获取修饰的属性
 *  setAccessible(true);忽略访问权限修饰符的安全检查，暴力反射
 * @author: Chuansheng Zhong
 * @create: 2019-12-03 14:54
 **/
public class ReflectDemo02 {

    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        //1.1 Field[] getFields();获取所有public修饰的属性
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //1.2 Field getField(String name);按名字获取public修饰的属性
        System.out.println("--------------");
        Field a = personClass.getField("a");
        String name = a.getName();
        Person p = new Person();
        Object value = a.get(p);
        System.out.println("a:" + name + ",字段a的值:" + value);
        a.set(p, "张三");
        System.out.println(p);
        //1.3 Field[] getDeclaredFields():获取所有成员变量，不考虑修饰符
        System.out.println("--------------");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //1.4 Field getDeclaredField(String name);
        Field name1 = personClass.getDeclaredField("name");
        //忽略访问权限修饰符的安全检查
        name1.setAccessible(true);//暴力反射
        Object o = name1.get(p);
        System.out.println(o);
    }
}
