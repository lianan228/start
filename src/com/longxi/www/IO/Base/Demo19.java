package com.longxi.www.IO.Base;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
字符流写数据的5中方式
write(int c)  写一个字符
write(char[] cbuf) 写入一个字符数组
write(char cbuf,int off,int len) 写入字符数组的一部分
write(String str) 写入一个字符串
write(String str,int off,int len) 写一个字符串的一部分
 */
public class Demo19 {
    public static void main(String[] args) throws Exception{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt"));

        //字符流写数据不能直接写入文件而是进入缓冲区
        //osw.write(97);
        //flush()  刷新流
        //osw.flush();

        char[] chs = {'a','b','c'};
        //osw.write(chs);

        //osw.write(chs,1,2);//bc

        //osw.write("abcde");

        osw.write("abcde",0,"abcde".length());//abcde
        osw.flush();
        osw.close();
    }
}
