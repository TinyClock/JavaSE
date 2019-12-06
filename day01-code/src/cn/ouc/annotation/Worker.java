package cn.ouc.annotation;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-05 10:57
 **/
@MyAnnotation(value = 12, per = Person.P1, anno2 = @MyAnnotation1, strs = {"a", "b"})
@MyAnnotation2
public class Worker {
}