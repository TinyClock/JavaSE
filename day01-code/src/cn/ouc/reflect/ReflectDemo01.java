package cn.ouc.reflect;

/**
 * @description:
 * 获取Class对象的方式：
 * 1、Class.forName("全类名[包名.类名]");将字节码文件加载进内存，返回Class对象
 *      【多用于配置文件，将类名定义在配置文件中。读取文件，加载类】
 * 2、类名.class
 *      【多用于参数的传递】
 * 3、对象.getClass()；
 *      【对象的获取字节码方式】
 * 同一个字节码文件(*.class)在一次程序的运行过程中，只会被加载一次，不论通过哪一种方式获取的class对象都是同一个。
 * @author: Chuansheng Zhong
 * @create: 2019-12-03 14:32
 **/
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1、Class.forName("全类名[包名.类名]");将字节码文件加载进内存，返回Class对象
        Class<?> cls1 = Class.forName("cn.ouc.reflect.Person");
        System.out.println(cls1);

        //2、类名.class
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        //3、对象.getClass()
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);

        System.out.println(cls1==cls2);//true
        System.out.println(cls1==cls3);//true

    }
}
