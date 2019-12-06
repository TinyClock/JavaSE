package cn.ouc.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @description: LinkedHashMap集合有序
 * @author: Chuansheng Zhong
 * @create: 2019-11-26 16:06
 **/
public class DemoLinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");
        System.out.println(map);
        System.out.println("----------------");

        HashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", "a");
        linkedHashMap.put("c", "c");
        linkedHashMap.put("b", "b");
        linkedHashMap.put("d", "d");
        System.out.println(linkedHashMap);
    }
}
