package com.longxi.www.File;


import java.io.File;
import java.util.Arrays;

/*
String[] list();获取指定目录下的所有文件或者文件夹的名称数组
File[] listFiles();获取指定目录下的所有文件或者文件夹的File数组
 */
public class Demo07 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹");

        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        //[新建文本文档.txt, 智能交通.doc, 智能交通.pptx, 清新绿.pptx, 电信20级.docx, 电信学院17级.docx, 电信学院17级.files, 电信学院17级.htm, 电信学院17级.xlsx, 电技20级.docx, 精读2课后题.docx, 通信20级.docx]

        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
        //[C:\Users\涟安\Desktop\Desktop\新建文件夹\新建文本文档.txt, C:\Users\涟安\Desktop\Desktop\新建文件夹\智能交通.doc,
        // C:\Users\涟安\Desktop\Desktop\新建文件夹\智能交通.pptx, C:\Users\涟安\Desktop\Desktop\新建文件夹\清新绿.pptx,
        // C:\Users\涟安\Desktop\Desktop\新建文件夹\电信20级.docx, C:\Users\涟安\Desktop\Desktop\新建文件夹\电信学院17级.docx,
        // C:\Users\涟安\Desktop\Desktop\新建文件夹\电信学院17级.files, C:\Users\涟安\Desktop\Desktop\新建文件夹\电信学院17级.htm,
        // C:\Users\涟安\Desktop\Desktop\新建文件夹\电信学院17级.xlsx, C:\Users\涟安\Desktop\Desktop\新建文件夹\电技20级.docx,
        // C:\Users\涟安\Desktop\Desktop\新建文件夹\精读2课后题.docx, C:\Users\涟安\Desktop\Desktop\新建文件夹\通信20级.docx]


    }
}
