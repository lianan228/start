package com.longxi.www.Scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //从键盘接受数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请使用nextLine方式接收：");

        String str = scanner.nextLine();

        System.out.println("输出的内容为："+str);
        scanner.close();
    }
}
