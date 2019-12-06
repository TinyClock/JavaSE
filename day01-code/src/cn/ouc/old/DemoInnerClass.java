package cn.ouc.old;

public class DemoInnerClass {

}

class Body {

    public class Hear {
        public void beat() {
            System.out.println("心脏跳动：蹦蹦蹦！");
            System.out.println(name);
        }
    }

    private String name;

    public void method() {
        System.out.println("外部类方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}