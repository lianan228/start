package com.longxi.www.Structure;

import java.util.Scanner;

public class if_Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");
        int i = scanner.nextInt();
        if (i>=60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
        scanner.close();
    }
}
