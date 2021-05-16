package com.longxi.www.Array.ArrayDemo;

//使用
//增强型循环在数组中的使用

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //jdk1.5 没有下标
        //for (int i : arr) {
        //    System.out.println(i);
        //}
        //System.out.println("============");
        System.out.println("============");
        int[] reverse = reverse(arr);
        printArray(reverse);
    }

    //打印数组
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    //反转数组
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];

        //反转操作
        for(int i = 0,j = result.length-1;i<arr.length;i++,j--){
            result[j] = arr[i];
        }
        return result;
    }
}
