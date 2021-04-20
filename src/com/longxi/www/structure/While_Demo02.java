package com.longxi.www.structure;

//do{
//
// }while();

public class While_Demo02 {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        do {
            sum+=i;
            i++;
        }while (i<=100);
        System.out.println(sum);//5050

        //循环至少执行一次
    }
}
