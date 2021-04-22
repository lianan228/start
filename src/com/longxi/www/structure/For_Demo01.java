package com.longxi.www.structure;

public class For_Demo01 {
    public static void main(String[] args) {

        //for
        for(int a=1;a<=10;a++){
            System.out.println(a);//1 2 3 4 5 6 7 8 9 10
        }

        //100.for
        int z = 0;
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i%2!=0){
                oddSum+=i;
            }else {
                evenSum+=i;
            }
        }
        System.out.println("奇数的和:"+oddSum);
        System.out.println("偶数的和:"+evenSum);
    }
}
