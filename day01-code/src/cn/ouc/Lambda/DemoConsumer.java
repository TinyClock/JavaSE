package cn.ouc.Lambda;

import java.util.function.Consumer;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 10:21
 **/
public class DemoConsumer {

    public static void printInfo(String[] array, Consumer<String> con1, Consumer<String> con2) {
        for (String s : array) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴，女", "古力娜扎，女", "马尔哈扎，男"};
        printInfo(array,
                s -> {
                    String name = s.split("，")[0];
                    System.out.print("姓名:" + name);
                }
                , s -> {
                    String sex = s.split("，")[1];
                    System.out.println("。性别：" + sex + "。");
                });
    }
}
