package com.longxi.www.base;

public class Demo02 {
    public static void main(String[] args) {
        //整数拓展
        //进制               二进制0b            十进制           八进制0           十六进制0x

        int i1 = 10;
        int i2 = 010;//八进制
        int i3 = 0x10;//十六进制

        System.out.println(i1);//10
        System.out.println(i2);//8
        System.out.println(i3);//16
        System.out.println("=========================================");


        //========================================================
        //浮点数拓展
        //========================================================
        //float     有限的  离散的  舍入误差  大约数  接近但不等于
        //double
        //最好不完全使用浮点数进行比较
        //最好不完全使用浮点数进行比较
        //最好不完全使用浮点数进行比较

        float f = 0.1f;
        double d = 1.0/10;

        System.out.println(f==d);//false
        System.out.println(f);//0.1
        System.out.println(d);//0.1


        System.out.println("=========================================");


        //========================================================
        //字符拓展
        //========================================================
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);


        System.out.println((int)c1);//强制转换成为int类型  97
        System.out.println((int)c2);//强制转换成为int类型

        //所有的字符本质还是数字
        //编码  Unicode   2字节   65536(0-65535)


        //========================================================
        //布尔拓展
        //========================================================

        boolean flag = true;
        if(flag){
            System.out.println("1");
        }
    }
}





















