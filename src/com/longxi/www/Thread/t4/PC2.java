package com.longxi.www.Thread.t4;
/*
信号灯法
标志位
 */
public class PC2 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}


//生产者---演员
class Player extends Thread{
    TV tv;
    public Player(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                try {
                    this.tv.play("快乐大本营");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    this.tv.play("抖音记录美好生活");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

//消费者---观众
class Watcher extends Thread{
    TV tv;
    public Watcher(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            this.tv.watch();
        }
    }
}

//产品---节目
class TV{
    //演员表演的时候观众等待  T
    //观众观看的时候演员等待  F
    String voice;//节目
    boolean flag = true;

    //表演
    public synchronized void play(String voice) throws InterruptedException {

        if (!flag){
            wait();
        }

        System.out.println("演员表演了"+ voice);
        //通知观众观看
        this.voice = voice;

        notifyAll();//通知唤醒
        this.flag = !this.flag;
    }

    //观看
    public synchronized void watch(){
        System.out.println("观众观看了"+ voice);
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.notifyAll();
        this.flag = !this.flag;
    }
}