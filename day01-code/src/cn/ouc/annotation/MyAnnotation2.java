package cn.ouc.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * 元注解：描述注解的注解
 * 1、@Target:描述注解能够作用的位置
 * * ElementType取值：
 * * TYPE:类上
 * * METHOD:成员方法上
 * * FIELD:字段上
 * 2、@Retention:描述注解被保留的阶段
 * *  @Retention(RetentionPolicy.RUNTIME:当前被描述的注解，会保留到class字节码文件中，并被JVM读取到
 * 3、@Documented:描述注解是否被抽取到API文档中
 * *
 * 4、@Inherited：描述注解是否被子类继承
 */
//@Target(ElementType.TYPE)//表示该AnnotationDemo03只能用于类上
//@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
//@Documented
@Inherited
public @interface MyAnnotation2 {

}
