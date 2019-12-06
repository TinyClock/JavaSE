package cn.ouc.annotation;

import cn.ouc.annotation.hibernate_annotation.*;
import cn.ouc.annotation.pojo.Hero;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-05 19:58
 **/
public class ParseHibernateAnnotation {
    public static void main(String[] args) {
        Class<Hero> heroClass = Hero.class;
        if (!heroClass.isAnnotationPresent(MyEntity.class)) {
            System.out.println("该类未被 MyEntity 注解描述");
            return;
        }
        System.out.println("Hero类是实体类");
        MyTable tableAnno = heroClass.getAnnotation(MyTable.class);
        System.out.println("其对应的表名是：" + tableAnno.name());

        Method[] methods = heroClass.getMethods();
        MyGeneratedValue geneAnno = null;
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyId.class)) {
                System.out.println("找到主键:" + method2attribute(method.getName()));
                geneAnno = method.getAnnotation(MyGeneratedValue.class);
                System.out.println("其自增长策略是：" + geneAnno.strategy());
                System.out.println("对应数据库中的字段是:" + method.getAnnotation(MyColumn.class).value());
            }
        }

        System.out.println("其他非主键属性分别对应的数据库字段如下：");
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyId.class))
                continue;
            MyColumn myColumn = method.getAnnotation(MyColumn.class);
            if (null == myColumn)
                continue;
            System.out.println("属性:" + method2attribute(method.getName()) + "\t\t对应的数据库字段是:" + myColumn.value());
        }
    }

    private static String method2attribute(String methodName) {
        String result = methodName;
        result = result.replaceFirst("get", "");
        result = result.replaceFirst("is", "");
        if (result.length() <= 1) {
            return result.toLowerCase();
        } else {
            return result.substring(0, 1).toLowerCase() + result.substring(1, result.length());
        }

    }
}
