package com.longxi.www.IO.Base;

import sun.nio.cs.ext.GBK;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/*
字符流中的编码解码问题
Reader:字符输入流的抽象类
Writer:字符输出流的抽象类

字符流中的编码解码问题相关的两个类
InputStreamReader
OutputStreamWriter
 */
public class Demo18 {
    public static void main(String[] args) throws Exception{
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt");
//
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt"), "GBK");
        //默认字符编码

        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt"),"GBK");

        //一次读取一个字符数据
        int ch;
        while ((ch= isr.read())!=-1){
            System.out.print((char)ch);
        }
        //
        isr.close();
    }
}
