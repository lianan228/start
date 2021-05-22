package com.longxi.www.IO.Base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
需求
    把源目录下的文件，复制到目标目录下
 */
public class Demo21 {
    public static void main(String[] args) throws Exception{

        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt"));

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\!!!!!!!!!.txt"));

        //一次写入一个字节数据
//        int ch;
//        while ((ch = isr.read())!=-1){
//            osw.write(ch);//int c  单个字符
//        }
//        一次写入字符数组
        char[] chars = new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            osw.write(chars);//字符数组
        }
        //abcde
        isr.close();
        osw.close();
    }
}
