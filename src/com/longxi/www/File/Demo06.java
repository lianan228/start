package com.longxi.www.File;

import java.io.File;
import java.util.Date;

/*
getAbsolutePath();获取绝对路径
getPath();获取相对路径
getName();获取名称
length();获取长度，字节数
lastModified();获取最后一次修改的时间，毫秒值
 */
public class Demo06 {
    public static void main(String[] args) throws Exception{
        //绝对路径
        //File file = new File("C:\\Users\\涟安\\Desktop\\Desktop\\c.txt");
        //相对路径
        File file1 = new File("C:\\Users\\涟安\\Desktop\\Desktop\\a.txt");
        file1.createNewFile();
        String absolutePath = file1.getAbsolutePath();
        System.out.println(absolutePath);
        //E:\Java_code\src\c.txt

        String path = file1.getPath();
        System.out.println(path);
        //c.txt

        //getName();获取名称
        System.out.println(file1.getName());//c.txt

        //length();
        System.out.println(file1.length());//0
        //编辑内容后该方法返回值不再为0


        //最后一次修改的时间
        long time = file1.lastModified();
        Date date = new Date(time);
        System.out.println(date.toLocaleString());//2021-4-29 17:18:25
    }
}
