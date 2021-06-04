package com.longxi.www.Thread.t4;
/*
测试生产者消费者模型
利用缓冲区解决
管程法

生产者 消费者 产品 缓冲区
 */
public class PC {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();

        new Producer(container).start();
        new Customer(container).start();
    }
}


//生产者
class Producer extends Thread{
    SynContainer container;
    public Producer(SynContainer container){
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            container.push(new Chicken(i));
            System.out.println("生产了"+i+"只鸡");
        }
    }
}

//消费者
class Customer extends Thread{
    SynContainer container;
    public Customer(SynContainer container){
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了"+container.pop().id+"只鸡");
        }
    }
}


//产品
class Chicken{
    int id; //产品编号

    public Chicken(int id) {
        this.id = id;
    }
}


//缓冲区
class SynContainer{

    //需要一个容器大小
    Chicken[] chickens = new Chicken[10];
    //容器计数器
    int cnt = 0;
    //生产者放入产品
    public synchronized void push(Chicken chicken){
        //如果容器满了，等待消费者消费
        if (cnt == chickens.length){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //通知消费者消费，生产等待
        }

        //如果没有满，丢入产品
        chickens[cnt] = chicken;
        cnt++;

        //可以通知消费者消费了
        this.notifyAll();
    }
    public synchronized Chicken pop(){
        //判断能否消费
        if (cnt==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //等待生产
        }

        //如果可以消费
        cnt--;
        Chicken chicken = chickens[cnt];

        //吃完了，通知生产者生产
        this.notifyAll();
        return chicken;
    }







}