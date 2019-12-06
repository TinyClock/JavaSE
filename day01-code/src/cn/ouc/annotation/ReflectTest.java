package cn.ouc.annotation;

import java.lang.reflect.Method;

/**
 * @description: 需求：写一个框架，前提，不能改类的任何代码，可以帮我们创建任意类的对象，并且执行其中的方法
 * 实现：
 * 1、配置文件
 * 2、反射
 * 步骤：
 * 1、将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 2、在程序中加载读取配置文件
 * 3、使用反射技术加载类文件进内存
 * 4、创建对象
 * 5、执行方法
 * <p>
 * 修改！这次是用注解来描述配置文件中的类名和方法名
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 19:13
 **/
@Pro(className = "cn.ouc.annotation.Demo01", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以帮我们创建任意类的对象，可以执行任意方法
        //前提，不能改类的任何代码。

        //1、解析注解
        //1.1 获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2、获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        /*
            public class ProImpl implements Pro{
                public String className(){
                    return "cn.ouc.annotation.Demo01";
                }
                public String methodName(){
                    return "show";
                }
            }
        */
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3、调取注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className + " " + methodName);

        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
