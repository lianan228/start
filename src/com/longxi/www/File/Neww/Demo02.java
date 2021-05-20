package com.longxi.www.File.Neww;

import java.io.File;

/*
遍历目录
C:\Users\涟安\Desktop\Desktop\新建文件夹 (2)
 */
public class Demo02 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)");
        get_0(file);
    }
    public static void get_0(File file){
        File[] files = file.listFiles();
        if(files!=null){
            for(File file1 : files){
                if (file1.isDirectory()){
                    get_0(file);
                }else {
                    System.out.println(file1.getAbsolutePath());
                }
            }
        }
        //C:\Users\涟安\Desktop\Desktop\新建文件夹 (2)\123_001x.txt
        //C:\Users\涟安\Desktop\Desktop\新建文件夹 (2)\123_002.txt
        //C:\Users\涟安\Desktop\Desktop\新建文件夹 (2)\123_003.txt
    }
}
