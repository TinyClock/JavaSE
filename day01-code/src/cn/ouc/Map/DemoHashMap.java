package cn.ouc.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-26 15:58
 **/
public class DemoHashMap {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        System.out.println("show02");
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("女王", 18), "英国");
        map.put(new Person("秦始皇", 18), "秦国");
        map.put(new Person("普京", 30), "俄罗斯");
        map.put(new Person("女王", 18), "毛里求斯");

        for (Person person : map.keySet()) {
            System.out.println(person.toString() + "-->" + map.get(person));
        }
    }

    private static void show01() {
        System.out.println("show01");
        Map<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("广州", new Person("王五", 20));
        map.put("北京", new Person("赵六", 18));

        for (Map.Entry<String, Person> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + "-->" + entrySet.getValue());
        }

    }
}
