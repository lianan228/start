package com.longxi.www.Method;

//递归

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        //A方法自己调用自己
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = f(n);
        System.out.println(ans);
    }
    public static int f(int n){

        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
