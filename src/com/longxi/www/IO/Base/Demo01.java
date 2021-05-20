package com.longxi.www.IO.Base;

//通过IO流往文件中写入一句话“Hello IO！”
//输出流
//字符流，不管是字节数据还是字符数据，本质都是字节数据
//字节输出流：OutputStream

//OutputStream的子类
//  FileOutputStream(File file)建一个向指定File对象表示的文件中写入数据的文件输出流
//  FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流

//相对于此程序输出内容到文件 所以是输出流

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*实现步骤
    1.创建流对象
    2.把数据变成字节数据
    3.用管道来传输数据到文件
*/
public class Demo01 {
    public static void main(String[] args) throws Exception{
        //创建流对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_002.txt");
        //上面的代码至少干了两件事
        //1.创建了管道
        //2.把管道连接到了123_002.txt文件
        //流对象会创建文件

        //数据
        String date = "Hello IO";
        //把字符数据转化为字节数据
        //getBytes()  返回一个字节数组
        byte[] bytes = date.getBytes();
        //System.out.println(Arrays.toString(bytes));//[72, 101, 108, 108, 111, 32, 73, 79]

        //通过管道把数据写入文件
        fos.write(bytes);

        //write(int b)  一次写一个字节数据
        //write(byte[] b) 将b.length字节从指定的字节数组写入此文件输入流
        //一次写一个字节数组的数据
        //write(byte[] b,int off,int len) 将len字节从指定的字节数组开始，
        //从偏移量off(索引的位置)开始写入此文件输入流一次写一个字节数组的部分数据

        FileOutputStream fos1 = new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_004.txt",true);
        //追加内容到末尾 ture

//        fos1.write(97);
//        fos1.write(98);
//        fos1.write(99);
//        fos1.write(100);
//        fos1.write(101);

        //byte[] bytes1 ={97,98,99,100,101,102};
        //byte[] getBytes 返回字符串的对应数组
        byte[] bytes2 = "abcde".getBytes(StandardCharsets.UTF_8);
        //fos1.write(bytes2);

        fos1.write(bytes2,0,bytes2.length);
        /*
        目标路径下创建了一个123_002.txt文件，并且内容为Hello IO
         */

        //实现换行功能，不同系统对换行符的识别是不同的
        //windows:\r\n
        //linux:\n
        //mac:\r
//        fos1.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行

        //关闭管道 回收
        fos.close();
    }
}
