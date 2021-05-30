package com.longxi.www;

import com.longxi.www.OOP.Demo05.A;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test0 implements Runnable {

    private String winner;
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 1000; i++) {
                if(Thread.currentThread().getName().equals("兔子")&&i%100==0){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }



                boolean flag = gameOver(i);

                if (flag){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"走了"+i+"步");
            }
        }
    }

    private boolean gameOver(int step) {
        if (winner!=null){
            return true;
        }
        if (step >= 1000){
            winner = Thread.currentThread().getName();
            System.out.println("winner is "+winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Test0 t = new Test0();

        new Thread(t,"兔子").start();
        new Thread(t,"乌龟").start();
    }
}
