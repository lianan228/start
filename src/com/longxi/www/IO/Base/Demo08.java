package com.longxi.www.IO.Base;

//自动刷新 打印流

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Demo08 {
    public static void main(String[] args) throws Exception{

        //开启自动刷新功能  在构造方法中打开
        //PrintWriter printWriter = new PrintWriter(new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_003.txt"),true);
        PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_003.txt"),true);
        //两种方法是一样的

        //换行打印
        printWriter.println(true);
        printWriter.println(2);
        printWriter.println('b');
        printWriter.println("hello io!");
        printWriter.println(new Object());
//        printWriter.close();

        //内容被修改
    }
}
