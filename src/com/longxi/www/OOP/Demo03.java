package com.longxi.www.OOP;

public class Demo03 {
    public static void main(String[] args) {
        int a = 1;
        //Demo03 demo03 = new Demo03();
        //demo03.add(1,2);

        double ans = add(1,4);
        System.out.println(ans);
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static double add(double a,double b){
        return a+b;
    }
}
