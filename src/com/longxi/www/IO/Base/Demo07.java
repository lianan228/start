package com.longxi.www.IO.Base;

//打印流

import java.io.PrintWriter;

public class Demo07 {
    public static void main(String[] args) throws Exception{
        PrintWriter printWriter = new PrintWriter("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_003.txt");

        //输入一些数据
        printWriter.write("Hello String");

        //字符流 刷新 close();--->flush
        //关闭流之后 文件内会出现 Hello String 字符串
        printWriter.flush();
        printWriter.close();
    }
}
