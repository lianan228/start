package com.longxi.www.IO.Base;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) throws Exception{
        //创建数据输出流对象
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)\\123_002.txt"));

        //写数据 8种基本类型 和 String
        dataOutputStream.writeByte(100);
        dataOutputStream.writeShort(101);
        dataOutputStream.writeChar(102);
        dataOutputStream.writeInt(103);
        dataOutputStream.writeFloat(104.5f);
        dataOutputStream.writeDouble(105.5);
        dataOutputStream.writeLong(107);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeUTF("Hello");

        dataOutputStream.close();

    }
}
