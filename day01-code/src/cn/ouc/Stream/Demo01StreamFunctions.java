package cn.ouc.Stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 15:56
 **/
public class Demo01StreamFunctions {
    public static void main(String[] args) {
        stream_forEach();
        System.out.println("----------------");
        stream_filter();
        System.out.println("----------------");
        stream_map();
        System.out.println("----------------");
        stream_count();
        System.out.println("----------------");
        stream_limit();
        System.out.println("----------------");
        stream_skip();
        System.out.println("----------------");
        stream_concat();
    }

    //终结方法
    public static void stream_forEach() {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
        stream.forEach(name -> System.out.println(name));
    }

    //延迟方法
    public static void stream_filter() {
//        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
//        Stream<String> stream1 = stream.filter(name -> name.startsWith("张"));
//        stream1.forEach(name1 -> System.out.println(name1));

        //简化
        Stream.of("张三", "李四", "王五", "赵六").filter(name -> name.startsWith("张")).forEach(name -> System.out.println(name));
    }

    //延迟方法
    public static void stream_map() {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<Integer> stream1 = stream.map(s -> Integer.parseInt(s));
        stream1.forEach(s -> System.out.println(s));
    }

    //终结方法
    public static void stream_count() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }

    //延迟方法
    public static void stream_limit() {
        Integer[] array = {1, 2, 3, 4, 5};
        Stream.of(array).limit(3).forEach(i -> System.out.println(i));
    }

    //延迟方法
    public static void stream_skip() {
        Integer[] array = {1, 2, 3, 4, 5};
        Stream.of(array).skip(3).forEach(i -> System.out.println(i));
    }

    public static void stream_concat() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Stream<String> stream1 = Stream.of("aa", "bb", "cc");
        Stream<? extends Serializable> concat = Stream.concat(stream, stream1);
        concat.forEach(name -> System.out.println(name));
    }
}
