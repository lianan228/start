package com.longxi.www.IO.More;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

/*
点名器
需求:有一个文件里面存储了班级同学的姓名，每个姓名占一行，要求通过程序实现随机点名器
*/
public class Demo03 {
    public static void main(String[] args) throws Exception{
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\涟安\\Desktop\\一些文件\\a\\12378.txt"));
        //创建ArrayList集合
        ArrayList<String> arrayList = new ArrayList<String>();

        //遍历文件内容并写入集合
        String line;
        while ((line= br.readLine())!=null){
            arrayList.add(line);
        }
        br.close();

        //创建随机数
        Random r = new Random();
        int index = r.nextInt(arrayList.size());

        //利用随机数随机获取集合中的内容
        String name = arrayList.get(index);
        System.out.println(name);
    }
}
