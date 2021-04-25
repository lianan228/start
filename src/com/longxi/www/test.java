package com.longxi.www;

import java.util.Arrays;
import java.util.Scanner;

//杨辉三角
//输入：一个整数
//输出：该数字对应杨辉三角形的第几个数字
/*
输入5
5
打印五行杨辉三角形
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
输入：
2
输出：
5
 */

public class test {

    static int[] arr2 = new int[100];
    static int[][] arr = new int[10][10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        System.out.println("输入行数:");
        //调用打印函数
        print(b);
        int k = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j <= i; j++) {
                arr2[k] = arr[i][j];
                k++;
            }
        }
        int c = scanner.nextInt();
        //System.out.println(Arrays.toString(arr2));
        int cnt = 1;
        for (int i = 0; i <= k; i++) {
            if(arr2[i]!=c){
                cnt++;
            }
            else {
                break;
            }
        }
        System.out.println(cnt );
    }

    //打印函数
    public static void print(int b){
        for (int i = 0; i < b; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
