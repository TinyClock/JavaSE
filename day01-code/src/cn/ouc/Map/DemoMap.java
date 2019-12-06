package cn.ouc.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-26 15:14
 **/
public class DemoMap {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show03() {
        System.out.println("show03");
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 180);
        map.put("b", 170);
        map.put("c", 178);
        map.put("d", 175);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "," + value);
        }
        System.out.println("---------------");
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();
            System.out.println(key + "," + value);
        }

    }

    /**
     * Map遍历方法
     */
    private static void show02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 180);
        map.put("b", 170);
        map.put("c", 178);
        map.put("d", 175);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            Integer i = map.get(it.next());
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for (String s : map.keySet()) {
            Integer i = map.get(s);
            System.out.println(s + "," + i);
        }

    }

    private static void show01() {
        Map<String, String> map = new HashMap<>();
        String str = map.put("a", "b");
        System.out.println(str);
        System.out.println(map);

        String str1 = map.put("a", "b1");
        System.out.println(str1);
        System.out.println(map);

        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");

    }
}
