package com.longxi.www.IO.Base;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
复制视频
 */
public class Demo15 {
    public static void main(String[] args) throws Exception{
        //记录开始时间
        long startTime = System.currentTimeMillis();
        method1();

        long endTime = System.currentTimeMillis();
        System.out.println("共耗时"+(endTime-startTime)+"毫秒");
    }

    private static void method1() throws Exception{
//        FileInputStream fis = new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\1.mp4");
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹\\1.mp4");
//
//        byte[] bytes = new byte[1024];
//        int len;
//        while ((len=fis.read(bytes))!=-1){
//            fos.write(bytes,0,len);
//        }
//        fis.close();
//        fos.close();
        //共耗时18毫秒


        //字节缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹\\1.mp4"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes);
        }
        bis.close();
        bos.close();
        //共耗时8毫秒
        //字节缓冲流方法更快
    }
}
