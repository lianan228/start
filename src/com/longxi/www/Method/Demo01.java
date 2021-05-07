package com.longxi.www.Method;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //两个数相加
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = add(a,b);//调用方法

        System.out.println(sum);
    }
    //加法方法
    public static int add(int x,int y){
        return x+y;
    }
}
