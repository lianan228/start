package com.longxi.www.String;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        String line = scanner.nextLine();

        //遍历字符串，首先要得到字符串中的每一个字符
//        for (int i = 0; i < 4; i++) {
//            System.out.print(line.charAt(i)+"\t");
//        }
        //遍历字符串，其次是要得到字符串的长度
        //System.out.println(line.length());

        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
