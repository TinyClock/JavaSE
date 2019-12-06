package cn.ouc.annotation;

/**
 *  格式：
 *      注解定义形式： public @interface MyAnnotation{}
 *      本质：  public interface MyAnnotation extends java.lang.annotation.Annotation {}
 *      注解本质上就是一个接口，该接口默认继承 java.lang.annotation.Annotation
 *
 *      属性：接口中的抽象方法
 *          要求：
 *          1、属性的返回值类型只能为以下
 *              基本数据类型
 *              String
 *              枚举
 *              注解
 *              以上类型的数组
 *          2、定义了属性，在使用时需要给属性赋值
 *              2.1 定义属性时，可以使用default关键字给属性默认初始化值，使用时可不赋值
 *              2.2 如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略
 *              2.3 数组赋值时，使用{}包裹。如果数组只有一个值，则{}可以省略
 *
 *      元注解：描述注解的注解
 *          1、@Target:描述注解能够作用的位置
 *          2、@Retention:描述注解被保留的阶段
 *          3、@Documented:描述注解是否被抽取到API文档中
 *          4、@Inherited：描述注解是否被子类继承
 */
public @interface MyAnnotation {

    int value();
//    int age();
//
//    String name() default "张三";
//    String show2();//称该抽象方法为注解的属性
    Person per();
    MyAnnotation1 anno2();
    String[] strs();

}
