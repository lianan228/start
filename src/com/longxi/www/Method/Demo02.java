package com.longxi.www.Method;

//定义和调用

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        System.out.println("请输入两个数字:");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

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
}
