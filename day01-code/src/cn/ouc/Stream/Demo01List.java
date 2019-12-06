package cn.ouc.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 10:03
 **/
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        System.out.println(list);

        //过滤，只取张开头的元素到新集合
        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                list1.add(s);
            }
        }
        System.out.println(list1);
        //过滤，只取姓名长度为3到新集合
        List<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.length()==3){
                list2.add(s);
            }
        }
        System.out.println(list2);
    }
}
