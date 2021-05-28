package com.longxi.www.Thread.t1;


//创建线程方式一 继承Thread类  重写run()方法，调用start开启线程

//总结：注意，线程开启不一定立即执行，有cpu调度执行
public class TestThread01 extends Thread{
    @Override
    public void run() {
        //super.run();线程方法体
        for (int i = 0; i < 20; i++) {
            System.out.println("我再看代码--"+i);
        }

    }

    public static void main(String[] args) {
        //创建一个线程对象
        TestThread01 testThread01 = new TestThread01();

        //调用start()方法开启线程
        testThread01.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("我再学习---"+i);
        }


        //中间会夹杂出现 “我再看代码--i”
    }
}
