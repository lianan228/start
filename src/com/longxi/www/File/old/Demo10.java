package com.longxi.www.File.old;

import java.util.Scanner;

/*
递归
方法定义中，调用方法本身的现象
 */
public class Demo10 {
    public static void main(String[] args) {
//        //回顾不死兔神问题，求第20个月兔子的对数
//        //每个月兔子对数:1,1,2,3,5,8,...
//        int[] arr = new int[20];
//
//        System.out.println(fn(10));
////        for (int i = 2; i < arr.length; i++) {
////            arr[i] = arr[i-1]+arr[i-2];
////        }
////        System.out.println(arr[19]);//6765
//    }
//    public static int fn(int n){
//        if (n == 1 || n == 2){
//            return 1;
//        }else {
//            return fn(n-1)+fn(n-2);
//        }

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        System.out.println(fn(i));
    }

    private static int fn(int i) {
        if(i==1){
            return i;
        }else {
            return i*fn(i-1);
        }
    }
}
