package com.longxi.www.Thread.t2;

public class Demo06 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread() + ":" + i);
        }
    }

    public static void main(String[] args) {
        //创建Demo06类对象
        Demo06 myRunnable = new Demo06();

        //创建Thread类的对象，把Demo06对象作为构造方法的参数
        //Thread(Runnable)
        Thread t1 = new Thread(myRunnable,"123");
        Thread t2 = new Thread(myRunnable,"456");

        //设置线程名
//        t1.setName("");

        t1.start();
        t2.start();
    }
}
