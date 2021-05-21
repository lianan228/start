package com.longxi.www.IO.Base;

import java.io.FileInputStream;

/*
FileInputStream(String name)
通过打开与实际文件的连接来创建一个FileInputStream，该文件由文件系统中
的路径名name命名

1.创建字节输入流对象
2.调用字节输入流对象读数据方法
3.释放资源
 */
public class Demo10 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123245621.txt");

        //读数据方法
        //int read(); 从该输入流读取一个字节的数据
//        int by = fis.read();
//        System.out.println((char) by);//h
//        //第二次读取数据
//        int read = fis.read();
//        System.out.println((char) read);//e

        //再多读取   文件的到达末尾 返回-1
        int read1;
        while ((read1 = fis.read())!=-1){
            System.out.print((char) read1);
        }
        fis.close();
    }
}
