package com.longxi.www.File;

import java.io.File;

/*
练习：判断
C:\Users\涟安\Desktop\Desktop 目录下是否有txt文件，如果有输出绝对路径
 */
//1.把搜索的目录封装成file对象
//2.得到所有的文件名称
//3.判断每个文件名称是否以.txt结尾，如果是就打印出来
public class Demo08 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\涟安\\Desktop\\Desktop");

        //得到该路径下所有文件名称
//        String[] names = file.list();
//
//        //判断每个文件名称是否以.txt结尾，如果是就打印出来
//        for (String string:names){
//            if (string.endsWith(".txt")){
//                System.out.println(string);//a.txt
//            }
//        }

        //得到该文件夹下的所有文件对象
        File[] files = file.listFiles();
        for (File file2 : files) {
            String name = file2.getName();
            if (name.endsWith(".txt")){
                //获取绝对路径
                String absolutePath = file2.getAbsolutePath();
                System.out.println(absolutePath);
            }
        }

    }
}
