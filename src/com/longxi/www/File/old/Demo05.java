package com.longxi.www.File.old;

/*
判断功能
1.isDirectory(); 判断是否为目录
2.isFile();判断是否为文件
3.exists(); 判断是否存在
4.canRead(); 判断是否可读
5.canWrite(); 判断是否可写
6.isHidden(); 判断是否隐藏
*/

import java.io.File;

public class Demo05 {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\涟安\\Desktop\\Desktop\\b");
        file.mkdir();
        File file1 = new File("C:\\Users\\涟安\\Desktop\\Desktop\\c.txt");
        file1.createNewFile();


        //1.isDirectory(); 判断是否为目录
        boolean rst = file.isDirectory();
        System.out.println(rst);//ture
        //2.isFile();判断是否为文件
        boolean rst1 = file1.isFile();
        System.out.println(rst1);//ture
        //3.exists(); 判断是否存在
        boolean rst2 = file.exists();
        System.out.println(rst2);//ture


        //4.canRead(); 判断是否可读
        //可读可写
        boolean rst3 = file.canRead();
        System.out.println(rst3);//ture
        //5.canWrite(); 判断是否可写
        //写同理 canWrite();

        //文件 -->  属性  -->  只读
        //设置完之后 文件将不再可写入


        //6.isHidden(); 判断是否隐藏
        File file2 = new File("C:\\Users\\涟安\\Desktop\\Desktop\\c.txt");
        boolean rst4 = file2.isHidden();
        System.out.println(rst4);//false


    }
}
