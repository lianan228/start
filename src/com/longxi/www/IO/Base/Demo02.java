package com.longxi.www.IO.Base;

//从文件中读取内容

import java.io.*;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) throws Exception{
        //BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_002.txt"));
        //LineNumberReader() 此方法输出有行号
        LineNumberReader Lnr = new LineNumberReader(new FileReader("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_002.txt"));

        //设置行号
        Lnr.setLineNumber(10);//输出   11:Hello IO
        String line;

        while ((line=Lnr.readLine())!=null){
            //System.out.println(line);//Hello IO   无行号
            //打印每行数据的时候把行号数出来
            System.out.println(Lnr.getLineNumber()+":"+line);//1:Hello IO
        }
        Lnr.close();

    }
}
