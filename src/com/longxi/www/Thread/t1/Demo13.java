package com.longxi.www.Thread.t1;
/*
线程优先级
 */
public class Demo13 {
    public static void main(String[] args) {
        //主线程默认优先级 main
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();
        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);

        //设置优先级再启动
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t3.setPriority(4);
        t3.start();
    }
}


class MyPriority implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority());
    }
}
