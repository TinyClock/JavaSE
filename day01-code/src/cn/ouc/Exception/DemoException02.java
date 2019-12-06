package cn.ouc.Exception;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-27 09:46
 **/
public class DemoException02 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] array1 = null;
        int ele1 = getElement(array,3);
        int ele = getElement(array1,2);
        System.out.println(ele);
    }

    private static int getElement(int[] array,int index) {
        if(array==null){
            throw new NullPointerException("数组为空！");
        }
        if(index>array.length){
            throw new IndexOutOfBoundsException("数组越界！");
        }
        int ele = array[index];
        return ele;
    }

}
