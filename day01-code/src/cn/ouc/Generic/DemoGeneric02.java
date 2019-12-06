package cn.ouc.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 泛型的高级使用
 * 泛型的上限限定：？ extends E 代表使用的泛型只能是E类型的子类或本身
 * 泛型的下限限定: ? super E   代表使用的泛型只能是E类型的父类或本身
 * @author: Chuansheng Zhong
 * @create: 2019-11-25 15:44
 **/
public class DemoGeneric02 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Number> list2 = new ArrayList<Number>();
        List<String> list3 = new ArrayList<String>();
        List<Object> list4 = new ArrayList<Object>();

        getElement1(list1);
        getElement1(list2);
//        getElement1(list3);
//        getElement1(list4);

//        getElement2(list1);
        getElement2(list2);
//        getElement2(list3);
        getElement2(list4);

    }

    public static void getElement1(List<? extends Number> list){
    }

    public static void getElement2(List<? super Number> list){

    }
}
