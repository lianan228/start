package com.longxi.www.IO.Base;

//打印流详解

import java.io.PipedWriter;
import java.io.PrintWriter;

public class Demo07_1 {
    public static void main(String[] args) throws Exception{
        PrintWriter printWriter = new PrintWriter("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_003.txt");

        //换行打印
        printWriter.println(true);
        printWriter.println(1);
        printWriter.println('a');
        printWriter.println("hello io");
        printWriter.println(new Object());

        printWriter.flush();
        printWriter.close();

    }
}

