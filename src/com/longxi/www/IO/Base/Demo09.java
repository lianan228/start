package com.longxi.www.IO.Base;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
/*
写数据加异常处理
 */
public class Demo09 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123245621.txt");
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if(fos != null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
