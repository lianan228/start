package com.longxi.www.File;

/*
创建功能
1.public boolean createNewFile(); 创建文件，如果存在这样的文件，就不创建了
2.public boolean mkdir(); 创建文件夹，如果存在就不创建
3.public boolean mkdirs(); 创建文件夹 如果父文件夹不存在 会创建出来
 */

import java.io.File;

public class Demo02 {
    public static void main(String[] args) throws Exception{     //抛出异常 Exception
        //1.public boolean createNewFile(); 创建文件，如果存在这样的文件，就不创建了

        File file = new File("C:\\Users\\涟安\\Desktop\\Desktop\\b.txt");
        //boolean newFile = file.createNewFile();//ture
        //System.out.println(newFile);
        //file.mkdir();//创建”b.txt“文件夹
        //file.createNewFile();

        //如果没有指明创建文件的路径，那么该文件是被创建在项目路径下的
        //E:\Java_code\src  内创建了一个dd.txt文件
        File file1 = new File("dd.txt");
        boolean rst1 = file1.createNewFile();
        System.out.println(rst1);


        //如果路径不存在
        //则不能创建  抛出异常IOException



        //创建文件夹
        File file2 = new File("C:\\Users\\涟安\\Desktop\\Desktop\\b");
        file2.mkdir();
        //该方法不能创建多层文件夹

        //mkdirs可以创建多层文件夹
        File file3 = new File("C:\\Users\\涟安\\Desktop\\Desktop\\b\\c");
        file3.mkdirs();//b\c
    }
}
