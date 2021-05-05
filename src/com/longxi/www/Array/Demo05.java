package com.longxi.www.Array;

//多维数组

public class Demo05 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};
        Demo04.printArray(array[0]);//12
        //引用Demo04中的方法

        System.out.println();

        System.out.println(array[0][0]);//1

        System.out.println("===========");
        //多维数组的遍历
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1]);
                System.out.print(" ");
            }
            System.out.println();
        }
        //1 2
        //2 3
        //3 4
        //4 5
    }
}
