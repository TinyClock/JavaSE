package cn.ouc.annotation;

/**
 * 定义：注解（Annotation），也叫元数据。一种代码级别的说明。它是JDK1.5及以后版本引入的一个特性，与类、接口、枚举是在同一个层次。它可以声明在包、类、字段、方法、局部变量、方法参数等的前面，用来对这些元素进行说明，注释。
 * 作用分类：
 * ①编写文档：通过代码里标识的注解生成文档【生成文档doc文档】
 * ②代码分析：通过代码里标识的注解对代码进行分析【使用反射】
 * ③编译检查：通过代码里标识的注解让编译器能够实现基本的编译检查【Override】
 *
 * @description: 注解javadoc演示
 * @author: Chuansheng Zhong
 * @create: 2019-12-05 09:50
 * @since 1.5
 **/
public class AnnotationDemo01 {
    /**
     * 计算两数的和
     *
     * @param a 整数
     * @param b 整数
     * @return 两数的和，整数
     */
    public int add(int a, int b) {
        return a + b;
    }
}
