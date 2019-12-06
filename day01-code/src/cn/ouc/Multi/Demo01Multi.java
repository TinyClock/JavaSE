package cn.ouc.Multi;

public class Demo01Multi {
    public static void main(String[] args) {
        Fu object = new Zi();
        object.method();
//        object.method2();
    }
}

class Fu {

    public void method() {
        System.out.println("父类方法");
    }
}

class Zi extends Fu {

    public void method2() {
        System.out.println("子类方法");
    }
}