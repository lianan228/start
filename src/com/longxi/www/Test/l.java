package com.longxi.www.Test;

import java.util.Arrays;
import java.util.Scanner;

import static com.longxi.www.Test.test.arr;

public class l {
    public static void main(String[] args) {
        int[] ints = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(ints));
    }
}
