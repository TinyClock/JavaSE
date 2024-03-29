package cn.ouc.annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description: 简单的测试框架
 * <p>
 * 当主方法执行时，将自动执行被检测的所有方法（加了Check注解的方法），判断方法是否有异常，记录到文件中
 * @author: Chuansheng Zhong
 * @create: 2019-12-05 15:46
 **/
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1、创建计算器对象
        Calculator calculator = new Calculator();
        //2、获取字节码文件对象
        Class<? extends Calculator> aClass = calculator.getClass();
        //3、获取所有方法
        Method[] methods = aClass.getMethods();

        int number = 0;//出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            //4、判断方法上是否有Check注解
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    //5、有，执行
                    method.invoke(calculator);
                } catch (Exception e) {
                    //6、捕获异常
                    number++;
                    bw.write(method.getName() + "方法出现了异常");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("----------------");
                    bw.newLine();
                }
            }
        }

        bw.write("本次测试一共出现了" + number + "次异常!");
        bw.flush();
        bw.close();
    }
}
