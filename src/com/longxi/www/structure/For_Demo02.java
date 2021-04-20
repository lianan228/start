package com.longxi.www.structure;

public class For_Demo02 {
    public static void main(String[] args) {
        //1-1000能被5整除的数，并且每行输出3个

        for (int i = 0; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
                //println  输出完会换行
                //print    不会换行
            }
            if(i%(5*3)==0){
                System.out.println();
                //System.out.print("\n");
            }
        }
    }
}
