package cn.ouc.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 15:48
 **/
public class Demo01GetStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        Map<String, String> map = new HashMap<>();

        //获取键，存储到一个set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();

        //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();

        //获取键值对映射关系
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        //把数组转化为stream流
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);

        Integer[] arr1 = {1, 2, 3, 4, 5};
        Stream<Integer> stream6 = Stream.of(arr1);

        String[] arr2 = {"123", "123"};
        Stream<String> stream7 = Stream.of(arr2);

    }
}
