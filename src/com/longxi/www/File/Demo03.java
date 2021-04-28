package com.longxi.www.File;

//删除 public boolean delete();

import java.io.File;

public class Demo03 {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\涟安\\Desktop\\Desktop\\b");
        //file.createNewFile();
        file.delete();//删除了b文件


        //delete方法删除文件夹时，该文件夹内不能有文件或文件夹

    }
}
