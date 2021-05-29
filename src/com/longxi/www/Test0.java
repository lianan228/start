package com.longxi.www;

import com.longxi.www.OOP.Demo05.A;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
卖票
 */

public class Test0 implements Runnable{

    private int tickets = 100;
    private int x = 0;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (obj) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName() + "窗口1" + tickets + "票");
                        tickets--;
                    }
                }
            } else {
                synchronized (obj) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName() + "窗口1" + tickets + "票");
                        tickets--;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Test0 my = new Test0();

        Thread ty1 = new Thread(my,"");

        ty1.start();
    }
}
