package cn.ouc.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 10:50
 **/
public class DemoPredicateTest {
    public static List<String> filter(String[] array, Predicate<String> p1,Predicate<String> p2){
        List<String> list = new ArrayList<>();
        for (String s : array) {
            if(p1.and(p2).test(s)){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔哈扎,男"};
        List<String> resultList = filter(array,s->s.split(",")[1].equals("女"),s1->s1.split(",")[0].length()==4);
        System.out.println(resultList);
    }
}
