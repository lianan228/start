package com.longxi.www.IO.More;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/*
需求:把ArrayList集合种的字符串数据写入到文本文件。
要求:每一个字符串元素作为文件中的一行数据

思路:
1.创建ArrayList集合
2.往集合中存储字符串元素
3.创建字符缓冲流输出流对象
4.遍历集合，得到每个字符串数据
5.调用字符缓冲输出流对象的方法写数据
6.释放资源
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\涟安\\Desktop\\一些文件\\a\\123.txt"));

        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
//        for(String s : arrayList){
//            bw.write(s);
//            bw.newLine();
//            bw.flush();
//        }
        bw.close();
    }
}
