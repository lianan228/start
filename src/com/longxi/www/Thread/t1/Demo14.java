package com.longxi.www.Thread.t1;
/*
线程同步

多个线程操作同一个资源
并发
 */

public class Demo14 {

    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();//创建同一对象，共享同一资源


        //传递同一个对象
        new Thread(station,"1").start();
        new Thread(station,"2").start();
        new Thread(station,"3").start();
    }


}

class BuyTicket implements Runnable{

    private int ticketNum = 1000;
    boolean flag = true;//外部停止方式

    @Override
    public void run() {
        //买票
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    //synchronized  同步方法,锁的是this
    private synchronized void buy() throws InterruptedException {
        if (ticketNum <= 0){
            flag = false;
            return;
        }

        Thread.sleep(1);
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNum--);
    }
}