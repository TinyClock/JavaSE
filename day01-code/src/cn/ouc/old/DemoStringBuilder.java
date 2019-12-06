package cn.ouc.old;

public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("123");
        stringBuilder.append(123);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.toString());

        Integer i = 12;
        System.out.println();
        System.out.println(Character.MIN_RADIX);
        String str1 = Integer.toString(123);
        System.out.println(str1);


    }
}
