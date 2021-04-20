package com.longxi.www.Scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //从键盘接收数据
        int i = 0;
        float f = 0.0f;
        if (scanner.hasNextInt()){
             i = scanner.nextInt();
            System.out.println("整数数据：" + i);
        }else{
            System.out.println("输入的不是整数数据！");
        }
    }
}
