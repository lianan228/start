package com.longxi.www.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,4,2,5,6,5,6,7,8,2};
        System.out.println(a);//[I@7f31245a

        //打印数组元素
        System.out.println(Arrays.toString(a));

        //升序排列  sort
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        //填充数组
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
        //0 ,0 ,0 ,0 ,0

        //从1到5进行填充
        //左闭右开
        Arrays.fill(a,1,5,3);
        System.out.println(Arrays.toString(a));
    }
}
