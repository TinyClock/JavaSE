package cn.ouc.annotation;

import java.util.Date;

/**
 * @description:
 * JDK中预定义的一-些注解
 * * @Override :检测被该注解标注的方法是否是继承自父类(接口)的
 * * @Deprecated; 该注解标注的内容，表示已过时
 * * @SuppressWarnings:压制警告
 * @author: Chuansheng Zhong
 * @create: 2019-12-05 10:09
 **/
@SuppressWarnings("all")
public class AnnotationDemo02 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){

    }

    public void show2(){
        //替代show1方法
    }

    public void demo(){
        show1();
        Date date = new Date();
        date.getMonth();
    }
}
