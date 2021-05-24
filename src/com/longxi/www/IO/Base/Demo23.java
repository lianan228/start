package com.longxi.www.IO.Base;

import com.longxi.www.OOP.Demo05.B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
BufferedWriter
    void newLine():写一行行分隔符，行分隔符字符串由系统属性定义
BufferedReader
    public String readLine():读一行文字。结果包含行的内容的字符串，不包括
    任何终止字符，如果流的结尾已经到达，则为null
 */
public class Demo23 {
    public static void main(String[] args) throws Exception {
        //创建字符缓冲流
        //BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\涟安\\Desktop\\一些文件\\a\\123.txt"));

//        for (int i = 0; i < 10; i++) {
//            bw.write("hello" + i);
//            //bw.write("\r\n"); //换行
//            bw.newLine();
//            bw.flush();
//        }
//
//        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\涟安\\Desktop\\一些文件\\a\\123.txt"));

        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
