package cn.ouc.Exception;

import java.io.FileNotFoundException;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-11-27 09:56
 **/
public class DemoThrows {
    public static void main(String[] args) throws FileNotFoundException {
        method();
        readFile("C:\\\\");
    }

    private static void method() throws NullPointerException {

    }

    public static void readFile(String fileName) throws FileNotFoundException {
        if(!fileName.equals("C:\\\\a.txt")){
            throw new FileNotFoundException("传递的路径不是C:\\a.txt");
        }
        System.out.println("传递的路径没有问题");
    }


}
