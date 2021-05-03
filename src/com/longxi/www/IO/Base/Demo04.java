package com.longxi.www.IO.Base;

//内存操作流

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) throws Exception{
        //创建字节流
        //创建输出流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        //往内存中写数据
        byteArrayOutputStream.write("hello".getBytes(StandardCharsets.UTF_8));

        //怎么得到内存中的数据？
        //内存输出流本身提供了一个方法可以返回内存中的数据的引用
        byte[] bytes = byteArrayOutputStream.toByteArray();
        System.out.println(new String(bytes));//hello
        //不用输入流也可以得到内存中的数据

        //用输入流
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        int ch;
        while ((ch=byteArrayInputStream.read())!=-1){
            System.out.print((char) ch);//hello
        }

        //关闭流 可以不用关闭
        //临时流
        byteArrayOutputStream.close();

    }
}
