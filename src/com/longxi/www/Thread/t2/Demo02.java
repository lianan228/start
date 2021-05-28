package com.longxi.www.Thread.t2;

public class Demo02 extends Thread{
    public Demo02(){}

    public Demo02(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+','+i);
        }
    }

    public static void main(String[] args) {
//        1
//        Demo02 demo02 = new Demo02();
//        Demo02 demo02_1 = new Demo02();
//
//
//        //设置线程名称 setName(String name);
//        demo02.setName("高铁");
//        demo02_1.setName("飞机");

//      2
        Demo02 my1 = new Demo02("高铁");
        Demo02 my2 = new Demo02("飞机");

        my1.start();
        my2.start();

        //子线程名称依次＋1
        //Thread-0
        //Thread-1

        System.out.println(Thread.currentThread().getName());
    }
}
