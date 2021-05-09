package com.longxi.www;

import java.util.Arrays;
import java.util.Scanner;

public class Hanglieshi {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if (scanner.hasNextInt()) {
                    ints[i][j] = scanner.nextInt();
                }
            }
        }
    }
    public static void returnResult(int[][] ints){
        if (ints.length == 1){
            System.out.println(ints[0][0]);
        }else{
            int cnt=0;
            int cnt1=0;
            int cnt2=ints[2][0];
            for (int i = 0; i < ints.length; i++) {
                for (int j = 0; j < ints.length; j++) {
                    if (i == j){
                        cnt+=i*j;
                    }else if(i + 1 == j){
                        cnt1+=i*j;
                    }
                }
            }
            int ans1 = cnt+cnt1+cnt2;
            for (int i = ints.length - 1; i > 0; i++) {
                for (int j = 0; j < ints.length; j++) {

                }
            }

        }
    }
}
