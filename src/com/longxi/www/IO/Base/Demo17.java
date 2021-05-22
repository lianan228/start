package com.longxi.www.IO.Base;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
字符串中的编码解码问题
getBytes();
getBytes(String charsetName)

String(byte[] bytes);
String(byte[] bytes,String charsetName);
 */
public class Demo17 {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "中国";

        //使用平台默认字符集编码和解码
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));

        //getBytes(String charsetName)
        //                UTF_8 / GBK

        String ss = new String(bytes);
        System.out.println(ss);

        //用什么编码就用什么解码
    }
}
