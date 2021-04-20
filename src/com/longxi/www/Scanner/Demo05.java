package com.longxi.www.Scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //求和和平均数
        Scanner scanner = new Scanner(System.in);
        
        
        //和
        double sum = 0;
        
        int m = 0;
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            System.out.println("你输入的第"+m+"个数据");
            m++;
            sum+=x;
        }

        System.out.println(sum);//100
        System.out.println(sum/m);//25

        scanner.close();
    }
}
