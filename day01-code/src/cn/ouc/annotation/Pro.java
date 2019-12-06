package cn.ouc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述需要执行的类名和方法名
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {
    String className();

    String methodName();
}

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