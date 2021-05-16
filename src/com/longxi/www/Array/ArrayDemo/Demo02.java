package com.longxi.www.Array.ArrayDemo;

//数组初始化

public class Demo02 {
    public static void main(String[] args) {
        //静态初始化

        //创建和赋值
        int[] a = {1,2,3,4,5,6};
        System.out.println(a[0]);

        //动态初始化:包含默认初始化
        //创建了之后默认值为0或null

        int[] b = new int[10];
        b[0] = 10;
        System.out.println(b[0]);//10
        System.out.println(b[1]);//0


    }
}
