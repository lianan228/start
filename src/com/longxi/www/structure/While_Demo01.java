package com.longxi.www.structure;

//while

public class While_Demo01 {
    public static void main(String[] args) {

        //输出1到100的和

        int j = 0;
        int sum = 0;
        while (j<=100){
            sum+=j;
            j++;
        }
        System.out.println(sum);//5050
    }
}
