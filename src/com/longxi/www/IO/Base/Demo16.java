package com.longxi.www.IO.Base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Demo16 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt");

        String s = "hello 中国";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        //[104, 101, 108, 108, 111, 32, -28, -72, -83, -27, -101, -67]

        fos.write(bytes);

        FileInputStream fis = new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt");

        byte[] bytes1 = new byte[1024];
        int len;
        while ((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
            //hello 中国
        }
        //GBK 占用两个字节
        //UTF-8 占用三个字节
    }
}
