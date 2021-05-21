package com.longxi.www.IO.Base;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
复制文本文件
从一个文件中读取出来(数据源)，再写入到另一个文件中(目的地)

数据源
InputStream --- FileInputStream
目的地
OutputStream --- FileOutputStream

根据数据源创建字节输入流对象
根据目的地创建字节输出流对象
读写数据：复制文本文件（一次读取一个字节，一次写入一个字节）
释放资源
 */
public class Demo11 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123245621.txt");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\79846546746.txt");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
