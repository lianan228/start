package com.longxi.www.Thread;

import com.longxi.www.IO.Base.Demo20;

/*
创建线程方式二，实现runnable接口，重写run方法，执行线程需要丢入runnable接口实现类
调用start方法
 */
public class Demo02 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }
    }

    public static void main(String[] args) {
        //创建runnable接口实现类对象
        Demo02 demo02 = new Demo02();

        //创建线程对象，通过线程对象来开启线程，代理
//        Thread thread = new Thread(demo02);
//
//        thread.start();
        //可合并为一句
        new Thread(demo02).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("main"+i);
        }
    }
}
