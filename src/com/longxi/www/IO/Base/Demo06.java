package com.longxi.www.IO.Base;

//字符串操作

import java.io.StringReader;
import java.io.StringWriter;

public class Demo06 {
    public static void main(String[] args) throws Exception{
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("hello io");

        stringWriter.close();
        //把内存中的字符串返回出来
        String string = stringWriter.toString();
        StringReader stringReader = new StringReader(string);

        //遍历输出1
        int ch;
        while ((ch=stringReader.read())!=-1){
            System.out.print((char) ch);
        }
        //hello io
    }
}
