package com.longxi.www.Thread.t1;

import java.util.concurrent.CopyOnWriteArrayList;

/*
测试JUC安全类型的集合
安全类型的集合
 */
public class Demo16 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        //10000

        Thread.sleep(3000);
        System.out.println(list.size());
    }



}
