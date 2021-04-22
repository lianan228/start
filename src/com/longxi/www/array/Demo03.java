package com.longxi.www.array;

//数组的使用

public class Demo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //打印全部的数组元素
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
        System.out.println();
        System.out.println("==================");

        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println(sum);//15
        System.out.println("==================");

        //查找最大元素
        int max = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]>max){
                max = arrays[i];
            }
        }
        System.out.println("数组最大值为"+max);

        System.out.println("==================");

    }
}
