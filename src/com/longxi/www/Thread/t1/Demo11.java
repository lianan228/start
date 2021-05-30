package com.longxi.www.Thread.t1;

//public class Demo11 extends Yield implements Runnable{
//    public static void main(String[] args) {
//        Demo11 demo11 = new Demo11();
//        new Thread(demo11, "a").start();
//        new Thread(demo11, "b").start();
//    }
//
//}
//
//class Yield implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName() + "线程开始执行");
//        Thread.yield();//礼让    不一定成功
//        System.out.println(Thread.currentThread().getName() + "线程终止执行");
//    }
//}

public class Demo11 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程vip来了" + i);
        }
    }

    public static void main(String[] args) {
        Demo11 demo11 = new Demo11();
        Thread thread = new Thread(demo11);
        thread.start();


        for (int i = 0; i < 1000; i++) {
            if (i == 200) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main" + i);
        }
    }
}









