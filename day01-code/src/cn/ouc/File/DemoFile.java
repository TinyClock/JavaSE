package cn.ouc.File;

import java.io.File;
import java.util.Arrays;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 15:11
 **/
public class DemoFile {
    public static void main(String[] args) {
        File fileD = new File("D:\\360MoveData\\Users\\ouc\\Desktop\\Java学习");
        File[] files = fileD.listFiles();
        System.out.println(Arrays.toString(files));

        File maxFile = files[0];
        File minFile = files[0];

        for (File file : files) {
            if(file.isDirectory())
                continue;
            if (file.length() > maxFile.length()) {
                maxFile = file;
            }
            if (file.length() < minFile.length()) {
                minFile = file;
            }
        }

        System.out.println(maxFile+",该文件大小为"+maxFile.length());
        System.out.println(minFile+",该文件大小为"+minFile.length());
    }
}
