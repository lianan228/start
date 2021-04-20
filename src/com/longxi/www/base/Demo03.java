package com.longxi.www.base;

public class Demo03 {
    public static void main(String[] args) {
        //类型转换
        //byte   shout   char   int   long   float   double
        int i = 128;
        byte b = (byte)i;//内存溢出
        System.out.println(i);//128
        System.out.println(b);//-128
        System.out.println((int)23.4);//23

        char c = 'a';
        int d = c + 1;
        System.out.println(d);//98
        System.out.println((char)d);//b

        //JDK7新特性  数字之间可以用下划线分割
        int money = 10_0000_0000;
        System.out.println(money);// 1000000000

        int year = 20;
        long total = ((long) year) * money;
        System.out.println(total);// 20000000000
    }
}
