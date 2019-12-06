package cn.ouc.old;

public class DemoEquals {
    public static void main(String[] args) {
        Person person1 = new Person("abc", 12);
        Person person2 = new Person("abc", 12);
        System.out.println(person1.equals(person2));
    }
}

