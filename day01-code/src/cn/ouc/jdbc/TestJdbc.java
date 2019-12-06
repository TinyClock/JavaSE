package cn.ouc.jdbc;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-06 10:40
 **/
public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        System.out.printf("驱动初始化成功！" + aClass.getName());
    }
}
