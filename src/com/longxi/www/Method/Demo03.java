package com.longxi.www.Method;

//方法的重载

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {

        System.out.println("请输入两个数字:");

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        //输出浮点数类型结果
        //同一个方法改变变量类型

        System.out.println(max(a,b));//20
    }
    //比大小
    public static int max(int a,int b){

        int result = 0;
        if(a == b){
            System.out.println("a==b");
            return 0;//终止方法
        }

        if (a>b){
            result = a;
        }else {
            result = b;
        }
        return result;
    }
    //比大小
    public static double max(double a,double b) {

        double result = 0;
        if (a == b) {
            System.out.println("a==b");
            return 0;//终止方法
        }

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

}
