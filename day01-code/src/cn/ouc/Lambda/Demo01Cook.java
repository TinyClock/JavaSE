package cn.ouc.Lambda;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-28 20:27
 **/
public class Demo01Cook {
    public static void main(String[] args) {

        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了1！");
            }
        });

        invokeCook(() -> System.out.println("吃饭了2！"));
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
