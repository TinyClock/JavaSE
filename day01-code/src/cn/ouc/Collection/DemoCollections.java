package cn.ouc.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-26 14:43
 **/
public class DemoCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        Collections.addAll(list,"1","2","3","4");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        List<Student> studentList = new ArrayList<>();
        Collections.addAll(studentList,new Student("abc",18),new Student("aaa",15),new Student("bbb",20));
        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(3);
        System.out.println(list1);
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list1);

        List<Student> studentList1 = new ArrayList<>();
        Collections.addAll(studentList1,new Student("abc",18),new Student("aaa",18),new Student("bbb",20));
        System.out.println(studentList1);
//        Collections.sort(studentList1, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        Collections.sort(studentList1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge()-o2.getAge();
                if(result==0){
                    result = o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });
        System.out.println(studentList1);
    }
}
