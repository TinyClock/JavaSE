package cn.ouc.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @description:
 * 需求：写一个框架，前提，不能改类的任何代码，可以帮我们创建任意类的对象，并且执行其中的方法
 * 实现：
 * 1、配置文件
 * 2、反射
 * 步骤：
 * 1、将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 2、在程序中加载读取配置文件
 * 3、使用反射技术加载类文件进内存
 * 4、创建对象
 * 5、执行方法
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 19:13
 **/
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以帮我们创建任意类的对象，可以执行任意方法
        //前提，不能改类的任何代码。

        //1. 加载配置文件
        //1.1 创建Properties方法
        //1.2 加载配置文件，转化为一个集合
        Properties properties = new Properties();
        //1.3 使用Class对象的类加载器获取配置文件的输入流
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("pro.properties");
        //加载配置文件
        properties.load(inputStream);

        //2.获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

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
