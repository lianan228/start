package com.longxi.www.IO.Base;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
字符流读数据的两种方式
read()   一次读取一个字符数据
read(char[] cbuf) 一次读一个字符数组数据
 */
public class Demo20 {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt"));

        //读数据
//        int read;
//        while ((read=isr.read())!=-1){
//            System.out.print((char) read);
//        }

        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars))!=-1){
            System.out.printf(new String(chars,0,len));
        }//abcde

        isr.close();

    }
}
