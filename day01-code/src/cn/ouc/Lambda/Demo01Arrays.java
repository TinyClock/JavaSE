package cn.ouc.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 20:30
 **/
public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] array = {
                new Person("a", 18),
                new Person("b", 19),
                new Person("c", 17)
        };

//        Arrays.sort(array, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        Arrays.sort(array, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Person person : array) {
            System.out.println(person.toString());
        }
    }
}
