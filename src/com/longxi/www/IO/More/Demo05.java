package com.longxi.www.IO.More;

import com.longxi.www.OOP.Demo05.B;

import java.io.*;

import static com.sun.deploy.cache.Cache.copyFile;

/*
复制单级文件夹
 */
public class Demo05 {
    public static void main(String[] args) throws Exception{
        //创建数据源目录file对象
        File srcFolder = new File("C:\\Users\\涟安\\Desktop\\一些文件\\a");
        //
        //String srcFolderName = srcFolder.getName();
        //创建目标目录file对象
        File destFolder = new File("C:\\Users\\涟安\\Desktop\\一些文件","b");
        //判断目的地对应file对象是否存在，若不存在就创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        //获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();

        //遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        for(File srcFile : listFiles){

            String srcFileName = srcFile.getName();
            File destFile = new File(destFolder,srcFileName);

            copyFile(srcFile,destFile);
        }
    }

    private static void copyFile(File srcFile,File destFile)throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bos.close();
        bis.close();

    }
}
