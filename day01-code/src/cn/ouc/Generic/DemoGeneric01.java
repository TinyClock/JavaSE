package cn.ouc.Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description: 泛型的通配符？
 * @author: Chuansheng Zhong
 * @create: 2019-11-25 15:39
 **/
public class DemoGeneric01 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        List<String> list1 = new ArrayList<>();
        list1.add("123");
        list1.add("456");
    }

    public static void printArray(List<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
