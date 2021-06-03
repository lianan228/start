package com.longxi.www;

import com.longxi.www.OOP.Demo05.A;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test0 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("//////");
        }
    }

    public static void main(String[] args) {
        Test0 test0 = new Test0();
        Thread thread = new Thread(test0);

        thread.start();

        Thread.State state = thread.getState();
        System.out.println(state);
        //RUNNABLE
    }
}