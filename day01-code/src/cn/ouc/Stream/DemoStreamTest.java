package cn.ouc.Stream;

import java.util.stream.Stream;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-29 16:29
 **/
public class DemoStreamTest {
    public static void main(String[] args) {
        //只要姓名长度为2，前三个
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六").filter(name -> name.length() == 2).limit(3);
        //只要姓张，不要前2个
        Stream<String> stream1 = Stream.of("张三1", "李四1", "王五1", "赵六1").filter(name -> name.startsWith("张")).skip(2);
        //将两个流和并，并按名称创建person类，打印person
        Stream.concat(stream, stream1).map(name -> new Person(name)).forEach(p -> System.out.println(p.toString()));
    }
}
