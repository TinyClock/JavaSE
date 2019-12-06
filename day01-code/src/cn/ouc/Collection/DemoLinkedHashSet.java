package cn.ouc.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-26 14:32
 **/
public class DemoLinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("www");
        set.add("123");
        System.out.println(set);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("www");
        linkedHashSet.add("123");
        System.out.println(linkedHashSet);
    }

    /**
     * 可变参数
     * @param arr
     * @return
     */
    public int add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

}
