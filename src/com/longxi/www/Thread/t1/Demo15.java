package com.longxi.www.Thread.t1;

import java.util.ArrayList;
import java.util.List;

//线程不安全的集合
public class Demo15 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 10000; i++) {
            new Thread(() ->{
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
                //10000
            }).start();
        }
        Thread.sleep(3000);
        System.out.println(list.size());
    }
}




