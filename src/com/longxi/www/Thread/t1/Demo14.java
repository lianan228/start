package com.longxi.www.Thread.t1;
/*
线程同步

多个线程操作同一个资源
并发
 */

//不安全案例
public class Demo14 {

    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();

        new Thread(station,"1").start();
        new Thread(station,"2").start();
        new Thread(station,"3").start();
    }


}

class BuyTicket implements Runnable{

    private int ticketNum = 10;
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

    private void buy() throws InterruptedException {
        if (ticketNum <= 0){
            flag = false;
            return;
        }

        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNum--);
    }
}