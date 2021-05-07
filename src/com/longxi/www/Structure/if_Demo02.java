package com.longxi.www.Structure;

//选择结构

import java.util.Scanner;

public class if_Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String s = scanner.nextLine();


        //equals  判断字符串是否一致
        if (s.equals("Hello")){
            System.out.println(s);
        }else{
            System.out.println("End");
        }

    }
}
