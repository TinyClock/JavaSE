package cn.ouc.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-26 10:45
 **/
public class DemoHashSet {
    public static void main(String[] args) {
        Set<Integer> set  = new HashSet<Integer>();
        set.add(1);
        set.add(5);
        set.add(1);
        set.add(2);

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

        System.out.println("----------");
        for (Integer o : set) {
            System.out.println(o);
        }

        HashSet<Student> studentHashSet = new HashSet<Student>();
        studentHashSet.add(new Student("aaa",18));
        studentHashSet.add(new Student("aaa",18));
        studentHashSet.add(new Student("bbb",18));

        for (Student student : studentHashSet) {
            System.out.println(student.toString());
        }
    }
}


