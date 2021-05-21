package com.longxi.www.IO.Base;

import java.io.FileInputStream;

/*
字节流读数据(一次读一个字节数组数据)
把文件中的内容读取出来在控制台输出

创建字节输入流对象
调用字节输入流对象读数据方法
释放资源
 */
public class Demo12 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123245621.txt");


//        byte[] bys = new byte[1024];//及其整数倍
//        int len = fis.read(bys);
//        System.out.println(len);
//        System.out.println(new String(bys,0,len));
        //5   实际读取数据的个数
        //hello

        //如果有多行内容 注意末尾的\r\n换行符
        //换行符会占用字节数组的位置

        //循环改进
        byte[] bys = new byte[1024];//及其整数倍
        int len;
        while ((len=fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        //hello
        fis.close();
    }
}
