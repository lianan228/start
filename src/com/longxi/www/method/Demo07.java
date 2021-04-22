package com.longxi.www.method;

//计算器

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String c = scanner.next();
        double d = test(a,b,c);
        System.out.println(d);
    }
    public static double test(double a,double b,String c){
        double ans = 0;
        switch (c){
            case "+":
                ans = a+b;
                break;
            case "-":
                ans = a-b;
                break;
            case "*":
                ans = a*b;
                break;
            case "/":
                ans = a/b;
                break;
            case "%":
                ans = a%b;
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
        return ans;
    }
}
