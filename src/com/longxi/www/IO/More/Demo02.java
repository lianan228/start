package com.longxi.www.IO.More;

import com.longxi.www.OOP.Demo05.A;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
需求:把文本文件中的数据读取到集合中，并遍历集合。
要求:文件中每一行数据是一个集合元素
 */
public class Demo02 {
    public static void main(String[] args) throws Exception{
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\涟安\\Desktop\\一些文件\\a\\123.txt"));
        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<String>();

        //遍历文件内容
        String line;
        while ((line = br.readLine())!=null){
            //将文件内容按行写入到集合中
            array.add(line);
        }

        //遍历集合
        for(String s : array){
            System.out.printf(s+' ');
        }
        //回收资源
        br.close();
    }
}
