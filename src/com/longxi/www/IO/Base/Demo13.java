package com.longxi.www.IO.Base;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
复制图片
C:\Users\涟安\Desktop\Desktop\新建文件夹 (2)
C:\Users\涟安\Desktop\Desktop

根据数据源创建字节输入流对象
根据目的地创建字节输出流对象
读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
 */
public class Demo13 {
    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\1.jpg");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\1.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fis.close();
        fos.close();
    }
}
