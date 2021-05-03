package com.longxi.www.IO.Base;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Demo03_1 {
    public static void main(String[] args) throws Exception{
        //创建数据输入流对象
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_002.txt"));

        //读数据  一一对应 不能错位
        byte b = dataInputStream.readByte();
        short i1 = dataInputStream.readShort();
        char c = dataInputStream.readChar();
        int i = dataInputStream.readInt();
        float v1 = dataInputStream.readFloat();
        double v = dataInputStream.readDouble();
        long l = dataInputStream.readLong();
        boolean b1 = dataInputStream.readBoolean();
        String s = dataInputStream.readUTF();

        System.out.println(b);
        System.out.println(i1);
        System.out.println(c);
        System.out.println(i);
        System.out.println(v1);
        System.out.println(v);
        System.out.println(l);
        System.out.println(b1);
        System.out.println(s);

        dataInputStream.close();

    }
}
