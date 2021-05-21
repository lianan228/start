package com.longxi.www.IO.Base;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/*
字节缓冲流
BufferedOutputStream:该类实现缓冲输出流，通过设置这样的输出流，应用程序可以向
底层输出写入字节，而不必为写入的每个字节导致底层系统的调用
BufferedInputStream:创建一个BufferedInputStream将创建一个内部缓冲区数组
当从流中读取或跳过字节时，内部缓冲区将根据需要从所包含的输入流中重新填充，一次很多字节

字节缓冲输出流
BufferedOutputStream(OutputStream out)
BufferedInputStream(InputStream in)

字节缓冲流仅仅提供缓冲区，而真正的读写数据还得依靠基本的字节流对象进行操作
 */
public class Demo14 {
    public static void main(String[] args) throws Exception{
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123245621.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);

//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\9633963.txt"));
//        //写数据
//        bos.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
//        bos.write("world\r\n".getBytes(StandardCharsets.UTF_8));

//        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\9633963.txt"));

        //一次读取一个字节数据
//        int by;
//        while ((by=bis.read())!=-1){
//            System.out.print((char) by);
//        }
//        //一次读取一个字节数组的数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1) {
            System.out.print(new String(bytes,0,len));
        }
        bis.close();
    }
}
