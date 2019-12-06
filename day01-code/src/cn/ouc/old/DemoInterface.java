package cn.ouc.old;

/*
    1、Java 8开始，接口允许定义默认方法
    格式：
    public default 返回值类型 方法名称（参数列表））{
        方法体
    }

    2、Java 8开始，接口当中允许定义静态方法
    public static 返回值类型 方法名称（参数列表））{
        方法体
    }

    3、我们需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题。
    但是这个共有方法不应该让实现类使用，应该是私有化的。|

    解决方案:
    从Java 9开始，接口当中允许定义私有方法。
    1.普通私有方法，解决多个默认方法之间重复代码问题
    格式:
    private返回值类型方法名称(参数列表) {
        方法体.
    2.静态私有方法，解决多个静态方法之间重复代码问题
    格式:
    private static 返回值类型方法名称(参数列表) {
        方法体
    }
 */
public interface DemoInterface {
    //这其实是一个常量，一旦赋值，不可以修改
    //1、接口当中的常量，可以省略public static final,注意:不写也照样是这样。
    //2、接口当中的常量，必须进行赋值:不能不赋值。
    //3、3.接口中常量的名称，使用完全大写的字母，用下划线进行分隔。(推荐命名规则)
    public static final int NUM = 0;

    public abstract void method();

    public void method1();

    abstract void method2();

    void method3();

    public default void methodDefault() {
        System.out.println("新添加的默认方法");
    }

    default void methodDefault2() {
        System.out.println("新添加的默认方法2");
    }

    public static void methodStatic() {
        System.out.println("新添加的静态方法");
    }

}

