package com.longxi.www.Thread.t3;

import java.util.concurrent.locks.ReentrantLock;

/*
显示定义同步锁
 */
public class Lock {
    public static void main(String[] args) {
        TestLock testLock = new TestLock();

        new Thread(testLock).start();
        new Thread(testLock).start();
        new Thread(testLock).start();
    }
}


class TestLock implements Runnable{

    int tickNum = 10;

    //定义Lock
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
       while (true){

           try {
               lock.lock();//加锁
               if (tickNum > 0){
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(tickNum--);
               }else {
                   break;
               }
           }finally {
                lock.unlock();//解锁
           }

       }
    }
}