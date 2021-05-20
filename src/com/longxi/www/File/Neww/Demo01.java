package com.longxi.www.File.Neww;

import java.io.File;

/*
File:它是文件和目录路径名的抽象表示
·文件和目录是可以通过File封装成对象的
·对于File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径名而已
它是可以存在的，也是可以不存在的。将来说要通过具体的操作把这个路径的内容转换为具体存在的

File(String pathname)
File(String parent,String child)
File(File parent,String child)

.createNewFile();
.mkdir();
.mkdirs();
*/
public class Demo01 {
    public static void main(String[] args) throws Exception{
        File file1 = new File("C:\\Users\\涟安\\Desktop\\Desktop\\a");
        //boolean newFile = file1.createNewFile();
        boolean mkdir = file1.mkdir();
        //System.out.println(mkdir);

//        System.out.println(file1.isFile());
//        System.out.println(file1.isDirectory());
//        System.out.println(file1.exists());
//        System.out.println(file1.getAbsolutePath());
//        System.out.println(file1.getPath());
//        System.out.println(file1.getName());
        //false
        //true
        //true
        //C:\Users\涟安\Desktop\Desktop\a
        //C:\Users\涟安\Desktop\Desktop\a
        //a
//        String[] list = file1.list();
//        for(String str:list){
//            System.out.println(str);
//        }
//
//        File[] files = file1.listFiles();
//        for(File file :files){
//            System.out.println(file.getName());
//        }



    }
}
