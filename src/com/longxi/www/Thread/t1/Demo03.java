package com.longxi.www.Thread.t1;
/*
实例
多个线程同时操作一个同一个对象
模拟抢票

发现问题
    多个线程操作同一个资源情况下，线程不安全，数据紊乱
 */
public class Demo03 implements Runnable{

    private int ticketNum = 10;


    @Override
    public void run() {
        while (true){
            if(ticketNum<=0) {
                break;
            }
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"--->拿到了第"+ticketNum--+"票");
        }
    }

    public static void main(String[] args) {
        Demo03 ticket = new Demo03();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛党").start();

    }
}
