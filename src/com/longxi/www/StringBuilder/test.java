package com.longxi.www.StringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//练习
/*
定义一个数组
按照[x,x,x]格式输出
调用方法
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        test test = new test();
        String string = test.arrayToString(arr);
        System.out.println(string);
    }
    public String arrayToString(int[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                stringBuilder.append(arr[i]);
            }else {
                stringBuilder.append(arr[i]);
                stringBuilder.append(',');
            }
        }
        stringBuilder.append(']');
        String s = stringBuilder.toString();
        return s;
    }
}
