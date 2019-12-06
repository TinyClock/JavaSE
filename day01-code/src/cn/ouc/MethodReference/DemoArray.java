package cn.ouc.MethodReference;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-03 10:55
 **/
public class DemoArray {
    public static int[] creatArray(int length, ArrayBuilder a) {
        return a.buildIntArray(length);
    }

    public static void main(String[] args) {
        int[] array1 = creatArray(3, (length) -> {
            return new int[length];
        });
        System.out.println(Arrays.toString(array1));

        int[] array2 = creatArray(5, int[]::new);
        System.out.println(Arrays.toString(array2));
    }
}
