package cn.ouc.old;

import java.util.Arrays;

public class DemoString {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);

        char[] charArray = new char[]{'a', 'b'};
        String str2 = new String(charArray);
        System.out.println(str2);

        byte[] byteArray = new byte[]{'1', '2'};
        String str3 = new String(byteArray);
        System.out.println(str3);

        String str4 = "xyz";
        System.out.println(str4);
        System.out.println("xyz".equals(str4));

        String str5 = "hello";
        String str6 = "world";
        System.out.println(str5.concat(str6));
        System.out.println(str5 + str6);

        String str7 = "111.222.333";
        String[] strArray = str7.split("\\.");
        for (String s : strArray) {
            System.out.println(s);
        }

        int[] intArray = {1, 3, 2, 4};
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + ",");
        }
        System.out.println("==========");
        String str8 = Arrays.toString(intArray);
        System.out.println(str8);

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

    }
}
