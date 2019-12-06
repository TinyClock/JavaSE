package cn.ouc.old;

public class DemoExtends {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.method();
        Zi zi = new Zi();
        zi.method();
    }
}

class Fu {
    int num = 10;

    public Fu() {
        System.out.println(this.toString());
    }

    public void method() {
        System.out.println(num);
    }
}

class Zi extends Fu {
    int num = 20;

    public Zi() {
//        super();//隐藏的，编译器自动添加，调用父类的无参构造方法
        System.out.println(this.toString());
    }

    @Override
    public void method() {
        System.out.println(num);
    }
}