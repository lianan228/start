package com.longxi.www.Array.ArrayDemo;

//冒泡排序

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[] a = {1,5,3,5,7,8,5,4,};
        int[] b = sort(a);
        System.out.println(Arrays.toString(b));
    }

    public static int[] sort(int[] a){
        for (int i = 0; i < a.length; i++) {

            boolean flag = false;//通过flag标志来减少没有意义的比较

            for (int j = 0; j < a.length - 1 - i; j++) {
                if(a[j+1]<a[j]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
        return a;
    }
}
