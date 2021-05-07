package com.longxi.www.Structure;

import java.util.Scanner;

public class If_Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个成绩：");

        double score = scanner.nextDouble();
        if(score>=60){
            System.out.println("及格");
        }else if (score>=80){
            System.out.println("良好");
        }else if (score>=95){
            System.out.println("优秀");
        }else {
            System.out.println("不及格");
        }
        scanner.close();
    }
}
