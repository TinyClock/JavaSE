package cn.ouc.hashCode;

/**
 * @description: 哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值，是一个逻辑地址,是模拟出来得到地址，不是数据实际存储的物理地址)
 * @author: Chuansheng Zhong
 * @create: 2019-11-25 16:08
 **/
public class DemoHashCode {
    public static void main(String[] args) {
        Person person = new Person();
        int i = person.hashCode();
        System.out.println(i);
        System.out.println(person.toString());

        String str = "123";
        int i1 = str.hashCode();
        System.out.println(i1);
    }
}
