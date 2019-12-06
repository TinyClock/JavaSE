package cn.ouc.String;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 13:46
 **/
public class DemoFormat {
    public static void main(String[] args) {
        double d = 3.14;
        String str1 = String.valueOf(d);
        System.out.println(str1);
        double d1 = Double.parseDouble(str1);
        System.out.println(d1);

        System.out.println(Double.parseDouble("3.1e4"));
    }
}
