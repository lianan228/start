package com.longxi.www.IO.Base;

import java.io.FileReader;
import java.io.FileWriter;

/*
改进版

运用子类 便捷类
编码问题还得使用父类方法
 */
public class Demo20_1 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt");

        FileWriter fw = new FileWriter("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\456.txt");

        int ch;
        while ((ch=fr.read())!=-1){
            fw.write(ch);
        }

        fr.close();
        fw.close();
    }
}
