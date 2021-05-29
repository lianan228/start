package com.longxi.www.Thread.t2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Lock锁
 */
public class Demo09 implements Runnable{
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();//加锁
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");

                    tickets--;
                }
            }finally {
                lock.unlock();//释放锁
            }
            //使用try finally
            //即使try中代码出现问题，最后也能释放锁
        }
    }

    public static void main(String[] args) {
        Demo09 myRunnable = new Demo09();

        Thread t1 = new Thread(myRunnable,"窗口一");
        Thread t2 = new Thread(myRunnable,"窗口二");
        Thread t3 = new Thread(myRunnable,"窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
