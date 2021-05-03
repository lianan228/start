package com.longxi.www.IO.Base;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class Demo05 {
    public static void main(String[] args) throws Exception{
        CharArrayWriter charArrayWriter = new CharArrayWriter();

        //将字符数组写入进内存
        char[] chars = {'h','e','l','l','o'};
        charArrayWriter.write(chars);

        //关闭流
        charArrayWriter.close();

        //创建一个字符数组接收数据
        //toCharArray() 返回一个字符数组
        char[] chars1 = charArrayWriter.toCharArray();
        //字符内存流读取数据
        CharArrayReader charArrayReader = new CharArrayReader(chars1);

        //遍历输出
        int ch;
        while ((ch=charArrayReader.read())!=-1){
            System.out.print((char) ch);
        }
        //hello

    }
}
