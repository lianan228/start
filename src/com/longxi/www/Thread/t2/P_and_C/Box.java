package com.longxi.www.Thread.t2.P_and_C;

public class Box {
    private int milk;
    //定义一个成员变量，表示奶箱的状态
    private boolean state = false;

    //提供存储牛奶和获取牛奶的操作
    public synchronized void put(int milk){
        //如果有牛奶，等待消费
        if (state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有牛奶，就生产牛奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");

        //生产完毕后，修改奶香状态
        state = true;

        //唤醒其他等待的线程
        notifyAll();

    }

    public synchronized void get() {
        //如果没有牛奶，等待生产
        if(!state){   //state = false  如果!state为真 则说明state为假 没有牛奶
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶，就消费牛奶
        System.out.println("用户拿到第" + this.milk + "瓶奶");

        //消费完毕之后修改奶箱状态
        state = false;

        //唤醒其他等待的线程
        notifyAll();
    }
}
