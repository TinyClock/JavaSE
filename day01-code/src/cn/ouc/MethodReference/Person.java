package cn.ouc.MethodReference;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-03 10:49
 **/
public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
