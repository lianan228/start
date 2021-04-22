package com.longxi.www.structure;

public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            if(i==30){
                break;
                //i==30 退出循环 到30停止
            }
        }
        System.out.println(i);
        while (i<=100){
            i++;
            if(i==20){
                continue;
                //终止某次循环
                //i==20时，不打印
            }
            System.out.println(i);
        }
    }
}
