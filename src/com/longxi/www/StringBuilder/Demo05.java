package com.longxi.www.StringBuilder;

import java.util.Scanner;

//字符串反转
public class Demo05 {
    public static void main(String[] args) {

        System.out.println("请输入一个字符串:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String reverse = myReverse(line);
        System.out.println(reverse);

    }
    public static String myReverse(String s){
//        StringBuilder stringBuilder = new StringBuilder(s);
//        stringBuilder.reverse();
//        String ss = stringBuilder.toString();
//        return ss;
        return new StringBuilder(s).reverse().toString();
    }
}
