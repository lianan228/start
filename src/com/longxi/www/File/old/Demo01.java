package com.longxi.www.File.old;

import java.io.File;
import java.io.StringReader;

public class Demo01 {
    public static void main(String[] args) {
        createFile();
    }
    public static void createFile(){

        //构造三种文件对象
        File file = new File("C:\\Users\\涟安\\Desktop\\Desktop\\a.txt");
        //File(String parent,String child);
        File file1 = new File("C:\\Users\\涟安\\Desktop\\Desktop","b.txt");
        //两种写法是一样的
        //java中认为文件夹也是一种特殊的文件
        File file2 = new File("C:\\Users\\涟安\\Desktop\\Desktop");
        File file3 = new File(file2,"c.txt");

        //file1方法最常用



        //File file = new File("C:\\Users\\涟安\\Desktop\\Desktop"+File.separator+"Test");
        //file.mkdir();
        // 在指定目录创建一个文件夹


        //String separator =  File.separator;
        //String directory = "myDir1" + separator + "myDir2";

        // 以下这句的效果等同于上面两句,windows下正斜杠/和反斜杠都是可以的
        // String directory = "myDir1/myDir2";
//        String directory = "myDir1/myDir2";
//        String fileName = "myFile.txt";
//        File f = new File(directory,fileName);
//
//        if (f.exists()){
//            System.out.println(f.getAbsolutePath());
//            System.out.println(f.getName());
//            System.out.println(f.length());
//        }else {
//            //先创建对象文件所在的目录
//            f.getParentFile().mkdir();
//        }


    }
}
