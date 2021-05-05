package com.longxi.www.Array;

//稀疏数组

public class Demo07 {
    public static void main(String[] args) {
        //1.创建一个二维数组 11*11 0：没有棋子  1：黑棋  2：白棋
        int[][] array1 = new int[11][11];
        array1[1][1] = 1;
        array1[2][3] = 1;
        //输出原始数组

        System.out.println("输出原始数组");

        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("================");
        //转化为稀疏数组
        //获取有效值的个数
        int sum = 0;
        for(int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++) {
                if (array1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println(sum);


        //2.创建一个稀疏数组
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //遍历二维数组，将非零的值，存入稀疏数组中
        int cnt = 0;
        for(int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[i][j]!=0){
                    cnt++;
                    array2[cnt][0] = i;
                    array2[cnt][1] = j;
                    array2[cnt][2] = array1[i][j];
                }
            }
        }
        //输出稀疏数组


        System.out.println("稀疏数组");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0]+"\t"
                                +array2[i][1]+"\t"
                                +array2[i][2]+"\t");
        }
    }
}
