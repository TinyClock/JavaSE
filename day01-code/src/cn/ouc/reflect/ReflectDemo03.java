package cn.ouc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description:
 * 2、获取构造方法
 * 2.1 Constructor<T> getConstructor(类<?>... parameterTypes)
 * 2.2 Constructor<?>[] getConstructors()
 * 2.3 Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 * 2.4 Constructor<?>[] getDeclaredConstructors()
 * 使用 constructor.newInstance();实例化对象
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 16:04
 **/
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person.toString());
        System.out.println(personClass.newInstance().toString());//调用无参构造函数新建对象
    }
}
