package cn.ouc.Collection;

import java.util.*;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-25 09:24
 **/
public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List vector = new Vector();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println(num);
        }
        for (Integer i:list
             ) {
            System.out.println(i);
        }
        int[] array = new int[]{1,2,3};
        System.out.println(Arrays.toString(array));

        LinkedList linkedList = new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.addFirst(1);
        linkedList.push(2);
        linkedList.addLast(3);
        System.out.println(linkedList);

    }
}
