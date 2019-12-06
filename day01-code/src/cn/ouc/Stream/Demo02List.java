package cn.ouc.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 10:08
 * <p>
 * Stream流 jdk1.8之后
 **/
public class Demo02List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        System.out.println(list);

        list.removeIf(s -> s.contains("周"));
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        list.forEach(s-> System.out.println(s));
        //过滤，只取张开头的元素到新集合
        //过滤，只取姓名长度为3到新集合
        //输出姓名
        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

        int[] array = {1,2,3};

        Arrays.stream(array).forEach(i-> System.out.println(i));
    }
}
