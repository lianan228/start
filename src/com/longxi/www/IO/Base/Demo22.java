package com.longxi.www.IO.Base;

import com.longxi.www.OOP.Demo05.B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/*
BufferedReader(Reader in)
BufferedReader(Reader in,int size)

BufferedWriter(Writer out)
BufferedWriter(Writer out,int size)

写入、读取文本，缓冲字符，以字符，数组等高效写入、读取可以指定缓冲区大小
，可以使用默认大小，默认值足够大，可用于大多数用途
 */
public class Demo22 {
    public static void main(String[] args) throws Exception{
        //FileWriter fw = new FileWriter("C:\\Users\\涟安\\Desktop\\Desktop\\a\\123.txt");

//        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\涟安\\Desktop\\Desktop\\a\\12378.txt"));
//
//        bw.write("hello\r\n");//换行
//        bw.write("java");
//
//        bw.close();

        BufferedReader bw = new BufferedReader(new FileReader("C:\\Users\\涟安\\Desktop\\Desktop\\a\\12378.txt"));

//        char[] chars = new char[1024];
//        int len;
//        while ((len=bw.read(chars))!=-1){
//            System.out.print(new String(chars,0,len));
//        }
        int ch;
        while ((ch=bw.read())!=-1){
            System.out.print((char) ch);
        }


    }
}
