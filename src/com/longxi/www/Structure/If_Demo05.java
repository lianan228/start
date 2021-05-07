package com.longxi.www.Structure;

//switch

import java.util.Scanner;

public class If_Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.printf("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            default:
                break;
        }
        //及格
    }
}
