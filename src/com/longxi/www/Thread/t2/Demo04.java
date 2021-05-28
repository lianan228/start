package com.longxi.www.Thread.t2;

/*
线程控制1

sleep(long millis)  停留指定毫秒数
join() 等待这个线程死亡
setDaemon(boolean on) 将此线程标记为守护线程，当运行的都是守护线程时，java虚拟机退出
 */
public class Demo04 extends Thread {
    public Demo04(){

    }

    public Demo04(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);

            //延时方法
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }


        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo04 ty1 = new Demo04("关羽");
        Demo04 ty2 = new Demo04("张飞");
        //Demo04 ty3 = new Demo04("孙权");


        //设置主线程为刘备
        Thread.currentThread().setName("刘备");

        //设置守护线程
        ty1.setDaemon(true);
        ty2.setDaemon(true);

        ty1.start();

        //ty1.join();
        //等待ty1线程执行完之后 ty2，ty3线程才执行

        ty2.start();
        //ty3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
