package com.longxi.www.String;

import java.util.Scanner;

//字符串反转
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = scanner.nextLine();
        //调用方法 用一个变量接收

        //实例化对象
        Demo04 demo04 = new Demo04();
        //String reverse = demo04.reverse(line);
        System.out.println(demo04.reverse(line));
    }
    public String reverse(String s){
        String ss = "";

        for(int i = s.length()-1;i>=0;i--){
            ss+=s.charAt(i);
        }

        return ss;
    }
}
